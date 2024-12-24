package com.example.scent.repo;

import com.example.scent.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangInterface extends JpaRepository<KhachHang, Integer> {
}
