package com.example.scent.rest;

import com.example.scent.entity.DungTich;

import com.example.scent.service.DungTichSv;
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
@RequestMapping("/rest/dung-tich")
public class DungTichCtrl {
    final
    DungTichSv dts;

    public DungTichCtrl(DungTichSv dts) {
        this.dts = dts;
    }

    @GetMapping("/getAll")
    public List<DungTich> getAll() {
        return dts.getAll();
    }

    @PostMapping("/add")
    public DungTich create(@RequestBody DungTich dt) {
        return dts.add(dt);
    }

    @PutMapping("/update")
    public DungTich update(@RequestBody DungTich dt) {
        return dts.update(dt);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { dts.delete(id);
    }
}

