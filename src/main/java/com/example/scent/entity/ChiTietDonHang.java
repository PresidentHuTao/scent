package com.example.scent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chi_tiet_don_hang")
@Entity
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "don_gia", precision = 19, scale = 4)
    private BigDecimal donGia;
    @Column(name = "so_luong")
    private Integer soLuong;
    @Column(name = "thanh_tien", precision = 19, scale = 4)
    private BigDecimal thanhTien;
    @ManyToOne
    @JoinColumn(name = "id_don_hang")
    private DonHang donHang;
    @ManyToOne
    @JoinColumn(name = "id_spct")
    private Spct spct;

}

