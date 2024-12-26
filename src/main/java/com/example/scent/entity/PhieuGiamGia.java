package com.example.scent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phieu_giam_gia")
@Entity
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ma_giam_gia")
    private String maGiamGia;
    @Column(name = "gia_tri_giam", precision = 3, scale = 2)
    private BigDecimal giaTriGiam;
    @Column(name = "ngay_bat_dau")
    private LocalDateTime ngayBatDau;
    @Column(name = "ngay_het_han")
    private LocalDateTime ngayHetHan;
    @JsonIgnore
    @OneToOne(mappedBy = "phieuGiamGia")
    private DonHang donHang;

}
