package com.example.scent.rest;

import com.example.scent.entity.MuiHuong;

import com.example.scent.service.MuiHuongSv;
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
@RequestMapping("/rest/mui-huong")
public class MuiHuongCtrl {
    final
    MuiHuongSv mhs;

    public MuiHuongCtrl(MuiHuongSv mhs) {
        this.mhs = mhs;
    }

    @GetMapping("/getAll")
    public List<MuiHuong> getAll() {
        return mhs.getAll();
    }

    @PostMapping("/add")
    public MuiHuong create(@RequestBody MuiHuong dt) {
        return mhs.add(dt);
    }

    @PutMapping("/update")
    public MuiHuong update(@RequestBody MuiHuong dt) {
        return mhs.update(dt);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { mhs.delete(id);
    }
}


