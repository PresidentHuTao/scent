package com.example.scent.rest;

import com.example.scent.entity.KhachHang;

import com.example.scent.service.KhachHangSv;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/khach-hang")
public class KhachHangCtrl {
    final
    KhachHangSv khs;

    public KhachHangCtrl(KhachHangSv khs) {
        this.khs = khs;
    }

    @GetMapping("/getAll")
    public List<KhachHang> getAll() {
        return khs.getAll();
    }

    @PostMapping("/add")
    public KhachHang create(@RequestBody KhachHang kh) {
        return khs.add(kh);
    }

    @PutMapping("/update")
    public KhachHang update(@RequestBody KhachHang kh) {
        return khs.update(kh);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { khs.delete(id);
    }
}

