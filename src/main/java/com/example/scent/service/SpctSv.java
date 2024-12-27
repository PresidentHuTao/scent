package com.example.scent.service;


import com.example.scent.entity.Spct;
import com.example.scent.repo.SpctInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpctSv {
    @Autowired
    SpctInterface spcti;


    public List<Spct> getAll() {
        return spcti.findAll();
    }


    public Spct add(Spct spct) {
        return spcti.save(spct);
    }


    public Spct update(Spct spct) {
        return spcti.save(spct);
    }


    public void delete(Integer id) {
        spcti.deleteById(id);
    }


    public Spct detail(Integer id) {
        return spcti.findById(id).get();
    }
}
