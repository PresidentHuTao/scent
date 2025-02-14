package com.example.scent.service;


import com.example.scent.entity.DonHang;
import com.example.scent.repo.DonHangInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DonHangSv {
    @Autowired
    DonHangInterface dhi;


    public List<DonHang> getAll() {
        return dhi.findAll();
    }


    public DonHang add(DonHang dh) {
        return dhi.save(dh);
    }


    public DonHang update(DonHang dh) {
        return dhi.save(dh);
    }


    public void delete(Integer id) {
        dhi.deleteById(id);
    }


    public DonHang detail(Integer id) {
        return dhi.findById(id).get();
    }
}
