package com.example.scent.service;


import com.example.scent.entity.ThuongHieu;
import com.example.scent.repo.ThuongHieuInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongHieuSv {
    @Autowired
    ThuongHieuInterface thi;


    public List<ThuongHieu> getAll() {
        return thi.findAll();
    }


    public ThuongHieu add(ThuongHieu th) {
        return thi.save(th);
    }


    public ThuongHieu update(ThuongHieu th) {
        return thi.save(th);
    }


    public void delete(Integer id) {
        thi.deleteById(id);
    }


    public ThuongHieu detail(Integer id) {
        return thi.findById(id).get();
    }
}
