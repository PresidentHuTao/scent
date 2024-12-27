package com.example.scent.service;


import com.example.scent.entity.HinhAnh;
import com.example.scent.repo.HinhAnhInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HinhAnhSv {
    @Autowired
    HinhAnhInterface hai;


    public List<HinhAnh> getAll() {
        return hai.findAll();
    }


    public HinhAnh add(HinhAnh ha) {
        return hai.save(ha);
    }


    public HinhAnh update(HinhAnh ha) {
        return hai.save(ha);
    }


    public void delete(Integer id) {
        hai.deleteById(id);
    }


    public HinhAnh detail(Integer id) {
        return hai.findById(id).get();
    }
}
