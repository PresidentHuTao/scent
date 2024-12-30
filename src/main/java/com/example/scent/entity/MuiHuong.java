package com.example.scent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "mui_huong")
@Entity
public class MuiHuong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_mui_huong")
    private String tenMuiHuong;
    @Column(name = "thuoc_tinh")
    private String thuocTinh;
    @JsonIgnore
    @OneToMany(mappedBy = "muiHuong")
    List<Spct> spct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenMuiHuong() {
        return tenMuiHuong;
    }

    public void setTenMuiHuong(String tenMuiHuong) {
        this.tenMuiHuong = tenMuiHuong;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public List<Spct> getSpct() {
        return spct;
    }

    public void setSpct(List<Spct> spct) {
        this.spct = spct;
    }
}

