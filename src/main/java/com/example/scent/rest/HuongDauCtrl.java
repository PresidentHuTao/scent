package com.example.scent.rest;

import com.example.scent.entity.HuongCuoi;

import com.example.scent.service.HuongCuoiSv;
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
@RequestMapping("/rest/huong-dau")
public class HuongDauCtrl {
    final
    HuongDauSv hds;

    public HuongDauCtrl(HuongDauSv hds) {
        this.hds = hds;
    }

    @GetMapping("/getAll")
    public List<HuongDau> getAll() {
        return hds.getAll();
    }

    @PostMapping("/add")
    public HuongDau create(@RequestBody HuongDau hd) {
        return hds.add(hd);
    }

    @PutMapping("/update")
    public HuongDau update(@RequestBody HuongDau hd) {
        return hds.update(hd);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { has.delete(id);
    }
}

