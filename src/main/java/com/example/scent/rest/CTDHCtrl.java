package com.example.scent.rest;

import com.example.scent.entity.ChiTietDonHang;

import com.example.scent.service.CTDHSv;
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
@RequestMapping("/rest/ctdh")
public class CTDHCtrl {
    final
    CTDHSv ctdhs;

    public CTDHCtrl(CTDHSv ctdhs) {
        this.ctdhs = ctdhs;
    }

    @GetMapping("/getAll")
    public List<ChiTietDonHang> getAll() {
        return ctdhs.getAll();
    }

    @PostMapping("/add")
    public ChiTietDonHang create(@RequestBody ChiTietDonHang ctdh) {
        return ctdhs.add(ctdh);
    }

    @PutMapping("/update")
    public ChiTietDonHang update(@RequestBody ChiTietDonHang ctdh) {
        return ctdhs.update(ctdh);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) {
        ctdhs.delete(id);
    }
}
