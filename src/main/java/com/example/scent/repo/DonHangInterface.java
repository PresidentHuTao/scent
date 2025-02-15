package com.example.scent.repo;

import com.example.scent.domain.dto.request.ThongKeRequest;
import com.example.scent.domain.enums.OrderStatus;
import com.example.scent.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository

public interface DonHangInterface extends JpaRepository<DonHang, Integer>{

    @Query("""
        SELECT COALESCE(SUM(x.tongTien), 0) FROM DonHang x
        WHERE (:#{#request.startDate} IS NULL OR x.ngayTao >= :#{#request.startDate})
        AND (:#{#request.enDate} IS NULL OR x.ngayTao <= :#{#request.enDate})
        AND :status = x.trangThai
        """)
    BigDecimal getTotalRevenueByStatusAndTime(@Param("request") ThongKeRequest request,
                                              @Param("status") OrderStatus status);

}
