package com.example.scent.service;

import com.example.scent.entity.DungTich;
import com.example.scent.repo.DungTichInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DungTichSv {
    @Autowired
    DungTichInterface dti;


    public List<DungTich> getAll() {
        return dti.findAll();
    }


    public DungTich add(DungTich dt) {
        return dti.save(dt);
    }


    public DungTich update(DungTich dt) {
        return dti.save(dt);
    }


    public void delete(Integer id) {
        dti.deleteById(id);
    }


    public DungTich detail(Integer id) {
        return dti.findById(id).get();
    }
}
