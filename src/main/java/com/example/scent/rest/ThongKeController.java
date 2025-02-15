package com.example.scent.rest;

import com.example.scent.domain.dto.request.ThongKeRequest;
import com.example.scent.domain.dto.response.ThongKeTheoThoiGianResponse;
import com.example.scent.service.ThongKeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/thong-ke")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ThongKeController {

    ThongKeService thongKeService;

    @GetMapping("/theo-khoang-time")
    public ThongKeTheoThoiGianResponse getAllByMuiHuong(ThongKeRequest request) {
        return thongKeService.thongKeTongTienByTime(request);
    }
}
