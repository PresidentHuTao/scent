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
@RequestMapping("/rest/huong-cuoi")
public class HuongDauCtrl {
    final
    HuongCuoiSv hcs;

    public HuongCuoiCtrl(HuongCuoiSv hcs) {
        this.hcs = hcs;
    }

    @GetMapping("/getAll")
    public List<HuongCuoi> getAll() {
        return hds.getAll();
    }

    @PostMapping("/add")
    public HuongCuoi create(@RequestBody HuongCuoi hc) {
        return hcs.add(hc);
    }

    @PutMapping("/update")
    public HuongCuoi update(@RequestBody HuongCuoi hc) {
        return hcs.update(hc);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { has.delete(id);
    }
}

