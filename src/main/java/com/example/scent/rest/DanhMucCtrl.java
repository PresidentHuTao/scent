package com.example.scent.rest;

import com.example.scent.entity.DanhMuc;

import com.example.scent.service.DanhMucSv;
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
@RequestMapping("/rest/danh-muc")
public class DanhMucCtrl {
    final
    DanhMucSv dms;

    public DanhMucCtrl(DanhMucSv dms) {
        this.dms = dms;
    }

    @GetMapping("/getAll")
    public List<DanhMuc> getAll() {
        return dms.getAll();
    }

    @PostMapping("/add")
    public DanhMuc create(@RequestBody DanhMuc dm) {
        return dms.add(dm);
    }

    @PutMapping("/update")
    public DanhMuc update(@RequestBody DanhMuc dm) {
        return dms.update(dm);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { dms.delete(id);
    }
}
