package com.example.scent.repo;

import com.example.scent.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanInterface extends JpaRepository<TaiKhoan, Integer>{
    @Query("SELECT tk FROM TaiKhoan tk WHERE tk.tenDangNhap = :tenDangNhap")
    TaiKhoan findByUsername(@Param("tenDangNhap") String tenDangNhap);

}
