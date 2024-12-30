package com.example.scent.rest;

import com.example.scent.entity.PhieuGiamGia;

import com.example.scent.service.PhieuGiamGiaSv;
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
@RequestMapping("/rest/phieu-giam-gia")
public class PhieuGiamGiaCtrl {
    final
    PhieuGiamGiaSv pggs;

    public PhieuGiamGiaCtrl(PhieuGiamGiaSv pggs) {
        this.pggs = pggs;
    }

    @GetMapping("/getAll")
    public List<PhieuGiamGia> getAll() {
        return pggs.getAll();
    }

    @PostMapping("/add")
    public PhieuGiamGia create(@RequestBody PhieuGiamGia pgg) {
        return pggs.add(pgg);
    }

    @PutMapping("/update")
    public PhieuGiamGia update(@RequestBody PhieuGiamGia pgg) {
        return pggs.update(pgg);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { pggs.delete(id);
    }
}

