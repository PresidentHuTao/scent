package com.example.scent.repo;

import com.example.scent.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SanPhamInterface extends JpaRepository<SanPham, Integer>{
    List<SanPham> findByTenContainingIgnoreCase(String ten);
}

