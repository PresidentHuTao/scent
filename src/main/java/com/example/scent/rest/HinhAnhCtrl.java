package com.example.scent.rest;

import com.example.scent.entity.HinhAnh;

import com.example.scent.service.HinhAnhSv;
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
@RequestMapping("/rest/hinh-anh")
public class HinhAnhCtrl {
    final
    HinhAnhSv has;

    public HinhAnhCtrl(HinhAnhSv has) {
        this.has = has;
    }

    @GetMapping("/getAll")
    public List<HinhAnh> getAll() {
        return has.getAll();
    }

    @PostMapping("/add")
    public HinhAnh create(@RequestBody HinhAnh ha) {
        return has.add(ha);
    }

    @PutMapping("/update")
    public HinhAnh update(@RequestBody HinhAnh ha) {
        return has.update(ha);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { has.delete(id);
    }
}

