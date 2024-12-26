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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "don_hang")
@Entity
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_nguoi_nhan_hang")
    private String tenNguoiNhanHang;
    @Column(name = "dia_chi_giao_hang")
    private String diaChiGiaoHang;
    @Column(name = "sdt_nguoi_nhan")
    private String sdtNguoiNhan;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "tong_tien", precision = 19, scale = 4)
    private BigDecimal tongTien;
    @Column(name = "phuong_thuc_van_chuyen")
    private String phuongThucVanChuyen;
    @Column(name = "ngay_van_chuyen")
    private LocalDateTime ngayVanChuyen;
    @Column(name = "phuong_thuc_thanh_toan")
    private String phuongThucThanhToan;
    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;
    @JsonIgnore
    @OneToMany(mappedBy = "donHang")
    List<ChiTietDonHang> chiTietDonHang;
    @OneToOne
    @JoinColumn(name = "id_phieu_giam_gia", unique = true)
    private PhieuGiamGia phieuGiamGia;
}
