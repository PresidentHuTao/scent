package com.example.scent.service;

import com.example.scent.entity.ThanhPhan;
import com.example.scent.repo.ThanhPhanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanhPhanSv {
    @Autowired
    ThanhPhanInterface tpi;


    public List<ThanhPhan> getAll() {
        return tpi.findAll();
    }


    public ThanhPhan add(ThanhPhan tp) {
        return tpi.save(tp);
    }


    public ThanhPhan update(ThanhPhan tp) {
        return tpi.save(tp);
    }


    public void delete(Integer id) {
        tpi.deleteById(id);
    }


    public ThanhPhan detail(Integer id) {
        return tpi.findById(id).get();
    }
}
