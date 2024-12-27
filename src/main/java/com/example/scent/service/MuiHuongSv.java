package com.example.scent.service;


import com.example.scent.entity.MuiHuong;
import com.example.scent.repo.MuiHuongInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuiHuongSv {
    @Autowired
    MuiHuongInterface mhi;


    public List<MuiHuong> getAll() {
        return mhi.findAll();
    }


    public MuiHuong add(MuiHuong muiHuong) {
        return mhi.save(muiHuong);
    }


    public MuiHuong update(MuiHuong muiHuong) {
        return mhi.save(muiHuong);
    }


    public void delete(Integer id) {
        mhi.deleteById(id);
    }


    public MuiHuong detail(Integer id) {
        return mhi.findById(id).get();
    }
}
