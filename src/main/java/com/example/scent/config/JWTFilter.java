package com.example.scent.config;

import com.example.scent.service.JWTSv;
import com.example.scent.service.TaiKhoanSv;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTFilter extends OncePerRequestFilter {
    @Autowired
    private JWTSv js;
    @Autowired
    ApplicationContext context;

    //xác thực jwt
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //lấy header từ http request, header này chứa jwt dạng bearer
        String authHeader = request.getHeader("Authorization");
        String token = null;
        String username = null;
        //nếu header (token) khác null và bắt đầu bằng Bearer
        if (authHeader != null && authHeader.startsWith("Bearer")) {
            //khi gửi đi, token sẽ bị chèn thêm đoạn "Bearer" ở phía trước nên phải cắt nó ra
            token = authHeader.substring(7);
            username = js.extractUsername(token);
        }
        //nếu username khác null và người dùng hiện tại chưa được xác thực
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            //tải thông tin xác thực cho người dùng
            UserDetails userDetails = context.getBean(TaiKhoanSv.class).loadUserByUsername(username);
            //validate token
            if (js.validateToken(token, userDetails)) {
                //tạo xác thực người dùng với mk là null và tải các quyền hạn cho đối tượng
                UsernamePasswordAuthenticationToken authToken
                        = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                //kèm thông tin chi tiết về http request vào authToken
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                //thiết lập xác thực, cho ứng dụng biết người dùng được đăng nhập và có quyền hạn
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
        //chuyển yêu cầu này vào chuỗi filter
        filterChain.doFilter(request, response);
    }
}
