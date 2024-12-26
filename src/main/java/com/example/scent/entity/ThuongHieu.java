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
@Table(name = "thuong_hieu")
@Entity
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_thuong_hieu")
    private String tenThuongHieu;
    @Column(name = "quoc_gia")
    private String quocGia;
    @Column(name = "mo_ta")
    private String moTa;
    @JsonIgnore
    @OneToMany(mappedBy = "thuongHieu")
    List<SanPham> sanPham;

}

