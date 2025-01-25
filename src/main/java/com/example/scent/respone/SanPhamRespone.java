package com.example.scent.respone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class SanPhamRespone {

    private Integer id;

    private String ten;

    private String moTa;

    private String thuongHieu;

    private String danhMuc;

    public SanPhamRespone(Integer id, String ten, String moTa, String thuongHieu, String danhMuc) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.thuongHieu = thuongHieu;
        this.danhMuc = danhMuc;
    }

    public SanPhamRespone() {
    }

    public Integer getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
