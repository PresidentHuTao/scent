package com.example.scent.service;

import com.example.scent.domain.dto.request.ThongKeRequest;
import com.example.scent.domain.dto.response.ThongKeTheoThoiGianResponse;
import com.example.scent.domain.enums.OrderStatus;
import com.example.scent.repo.DonHangInterface;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
@RequiredArgsConstructor
public class ThongKeService {

    DonHangInterface donHangRepo;

    public ThongKeTheoThoiGianResponse thongKeTongTienByTime(ThongKeRequest request) {
        BigDecimal totalAmount = donHangRepo.getTotalRevenueByStatusAndTime(request, OrderStatus.COMPLETED);
        ThongKeTheoThoiGianResponse response = new ThongKeTheoThoiGianResponse();
        response.setTongTien(totalAmount);
        return response;
    }
}
