package com.example.scent.service;



import com.example.scent.entity.DanhMuc;
import com.example.scent.repo.DanhMucInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucSv {
    @Autowired
    DanhMucInterface dmi;


    public List<DanhMuc> getAll() {
        return dmi.findAll();
    }


    public DanhMuc add(DanhMuc dm) {
        return dmi.save(dm);
    }


    public DanhMuc update(DanhMuc dm) {
        return dmi.save(dm);
    }


    public void delete(Integer id) {
        dmi.deleteById(id);
    }


    public DanhMuc detail(Integer id) {
        return dmi.findById(id).get();
    }
}
