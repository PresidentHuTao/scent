package com.example.scent.rest;

import com.example.scent.entity.KhachHang;
import com.example.scent.repo.KhachHangInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class KhachHangRest {
    @Autowired
    KhachHangInterface khi;
    @GetMapping("/getAll")
    public List<KhachHang> getAll() {
        return khi.findAll();
    }
}
