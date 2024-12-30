package com.example.scent.rest;

import com.example.scent.entity.ThuongHieu;
import com.example.scent.service.ThuongHieuSv;
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
@RequestMapping("/rest/thuong-hieu")
public class ThuongHieuCtrl {
    final
    ThuongHieuSv ths;

    public ThuongHieuCtrl(ThuongHieuSv ths) {
        this.ths = ths;
    }

    @GetMapping("/getAll")
    public List<ThuongHieu> getAll() {
        return ths.getAll();
    }

    @PostMapping("/add")
    public ThuongHieu create(@RequestBody ThuongHieu th) {
        return ths.add(th);
    }

    @PutMapping("/update")
    public ThuongHieu update(@RequestBody ThuongHieu th) {
        return ths.update(th);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { ths.delete(id);
    }
}


