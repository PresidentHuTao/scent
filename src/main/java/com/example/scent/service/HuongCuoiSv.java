package com.example.scent.service;

import com.example.scent.entity.HuongCuoi;
import com.example.scent.repo.HuongCuoiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuongCuoiSv {
    @Autowired
    HuongCuoiInterface hci;


    public List<HuongCuoi> getAll() {
        return hci.findAll();
    }


    public HuongCuoi add(HuongCuoi hc) {
        return hci.save(hc);
    }


    public HuongCuoi update(HuongCuoi hc) {
        return hci.save(hc);
    }

    public void delete(Integer id) {
        hci.deleteById(id);
    }
    public HuongCuoi detail(Integer id) {
        return hci.findById(id).get();
    }

}
