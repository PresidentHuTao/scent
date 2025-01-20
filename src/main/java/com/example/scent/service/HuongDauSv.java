package com.example.scent.service;

import com.example.scent.entity.HuongDau;
import com.example.scent.repo.HuongDauInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuongDauSv {
    @Autowired
    HuongDauInterface hdi;


    public List<HuongDau> getAll() {
        return hdi.findAll();
    }


    public HuongDau add(HuongDau hd) {
        return hdi.save(hd);
    }


    public HuongDau update(HuongDau hd) {
        return hdi.save(hd);
    }

    public void delete(Integer id) {
        hdi.deleteById(id);
    }
    public HuongDau detail(Integer id) {
        return hdi.findById(id).get();
    }

}
