package com.example.scent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spct")
@Entity
public class Spct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "don_gia", precision = 19, scale = 4)
    private BigDecimal donGia;
    @Column(name = "so_luong_ton_kho")
    private Integer soLuongTonKho;
    @Column(name = "trang_thai")
    private String trangThai;
    @ManyToOne
    @JoinColumn(name = "id_san_pham")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn(name = "id_dung_tich")
    private DungTich dungTich;
    @ManyToOne
    @JoinColumn(name = "id_mui_huong")
    private MuiHuong muiHuong;
    @ManyToOne
    @JoinColumn(name = "id_thanh_phan")
    private ThanhPhan thanhPhan;
    @JsonIgnore
    @OneToMany(mappedBy = "spct")
    List<ChiTietDonHang> chiTietDonHang;
}

