package com.example.scent.entity;

import com.example.scent.domain.enums.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "don_hang")
@Entity

public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "ten_nguoi_nhan_hang")
    String tenNguoiNhanHang;

    @Column(name = "dia_chi_giao_hang")
    String diaChiGiaoHang;

    @Column(name = "sdt_nguoi_nhan")
    String sdtNguoiNhan;

    @Column(name = "ghi_chu")
    String ghiChu;

    @Column(name = "tong_tien", precision = 19, scale = 4)
    BigDecimal tongTien;

    @Column(name = "phuong_thuc_van_chuyen")
    String phuongThucVanChuyen;

    @Column(name = "ngay_van_chuyen")
    LocalDateTime ngayVanChuyen;

    @Column(name = "phuong_thuc_thanh_toan")
    String phuongThucThanhToan;

    @Column(name = "ngay_tao")
    Long ngayTao;

    @Column(name = "trang_thai")
    OrderStatus trangThai;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "id_tai_khoan")
    TaiKhoan taiKhoan;

    @OneToOne
    @JoinColumn(name = "id_phieu_giam_gia", unique = true)
    PhieuGiamGia phieuGiamGia;

}
