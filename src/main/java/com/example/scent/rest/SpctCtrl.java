package com.example.scent.rest;

import com.example.scent.entity.Spct;

import com.example.scent.service.SpctSv;
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
@RequestMapping("/rest/spct")
public class SpctCtrl {
    final
    SpctSv spcts;

    public SpctCtrl(SpctSv spcts) {
        this.spcts = spcts;
    }

    @GetMapping("/getAll")
    public List<Spct> getAll() {
        return spcts.getAll();
    }

    @PostMapping("/add")
    public Spct create(@RequestBody Spct spct) {
        return spcts.add(spct);
    }

    @PutMapping("/update")
    public Spct update(@RequestBody Spct spct) {
        return spcts.update(spct);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) { spcts.delete(id);
    }
}


