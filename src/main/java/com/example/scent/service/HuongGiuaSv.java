package com.example.scent.service;

import com.example.scent.entity.HuongGiua;
import com.example.scent.repo.HuongGiuaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuongGiuaSv {
    @Autowired
    HuongGiuaInterface hgi;


    public List<HuongGiua> getAll() {
        return hgi.findAll();
    }


    public HuongGiua add(HuongGiua hg) {
        return hgi.save(hg);
    }


    public HuongGiua update(HuongGiua hg) {
        return hgi.save(hg);
    }

    public void delete(Integer id) {
        hgi.deleteById(id);
    }
    public HuongGiua detail(Integer id) {
        return hgi.findById(id).get();
    }

}
