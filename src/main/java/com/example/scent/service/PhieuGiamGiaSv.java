package com.example.scent.service;


import com.example.scent.entity.PhieuGiamGia;
import com.example.scent.repo.PhieuGiamGiaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaSv {
    @Autowired
    PhieuGiamGiaInterface pggi;


    public List<PhieuGiamGia> getAll() {
        return pggi.findAll();
    }


    public PhieuGiamGia add(PhieuGiamGia phieuGiamGia) {
        return pggi.save(phieuGiamGia);
    }


    public PhieuGiamGia update(PhieuGiamGia phieuGiamGia) {
        return pggi.save(phieuGiamGia);
    }


    public void delete(Integer id) {
        pggi.deleteById(id);
    }


    public PhieuGiamGia detail(Integer id) {
        return pggi.findById(id).get();
    }
}
