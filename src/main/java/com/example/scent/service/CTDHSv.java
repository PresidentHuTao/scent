package com.example.scent.service;

import com.example.scent.entity.ChiTietDonHang;
import com.example.scent.repo.CTDHInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CTDHSv {
    @Autowired
    CTDHInterface ctdhi;


    public List<ChiTietDonHang> getAll() {
        return ctdhi.findAll();
    }


    public ChiTietDonHang add(ChiTietDonHang ctdh) {
        return ctdhi.save(ctdh);
    }


    public ChiTietDonHang update(ChiTietDonHang ctdh) {
        return ctdhi.save(ctdh);
    }


    public void delete(Integer id) {
        ctdhi.deleteById(id);
    }


    public ChiTietDonHang detail(Integer id) {
        return ctdhi.findById(id).get();
    }
}
