package com.example.scent.rest;

import com.example.scent.entity.ThanhPhan;
import com.example.scent.service.ThanhPhanSv;
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
@RequestMapping("/rest/thanh-phan")
public class ThanhPhanCtrl {
    final
    ThanhPhanSv tps;

    public ThanhPhanCtrl(ThanhPhanSv tps) {
        this.tps = tps;
    }

    @GetMapping("/getAll")
    public List<ThanhPhan> getAll() {
        return tps.getAll();
    }

    @PostMapping("/add")
    public ThanhPhan create(@RequestBody ThanhPhan tp) {
        return tps.add(tp);
    }

    @PutMapping("/update")
    public ThanhPhan update(@RequestBody ThanhPhan tp) {
        return tps.update(tp);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { tps.delete(id);
    }
}


