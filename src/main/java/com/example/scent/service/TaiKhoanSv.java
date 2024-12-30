package com.example.scent.service;


import com.example.scent.entity.TaiKhoan;
import com.example.scent.repo.TaiKhoanInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanSv {
    final
    TaiKhoanInterface tki;

    public TaiKhoanSv(TaiKhoanInterface tki) {
        this.tki = tki;
    }


    public List<TaiKhoan> getAll() {
        return tki.findAll();
    }


    public TaiKhoan add(TaiKhoan tk) {
        return tki.save(tk);
    }


    public TaiKhoan update(TaiKhoan tk) {
        return tki.save(tk);
    }


    public void delete(Integer id) {
        tki.deleteById(id);
    }


    public TaiKhoan detail(Integer id) {
        return tki.findById(id).get();
    }
}
