package com.example.scent.rest;

import com.example.scent.entity.DonHang;

import com.example.scent.service.DonHangSv;
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
@RequestMapping("/rest/don_hang")
public class DonHangCtrl {
    final
    DonHangSv dhs;

    public DonHangCtrl(DonHangSv dhs) {
        this.dhs = dhs;
    }

    @GetMapping("/getAll")
    public List<DonHang> getAll() {
        return dhs.getAll();
    }

    @PostMapping("/add")
    public DonHang create(@RequestBody DonHang dh) {
        return dhs.add(dh);
    }

    @PutMapping("/update")
    public DonHang update(@RequestBody DonHang dh) {
        return dhs.update(dh);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { dhs.delete(id);
    }
}
