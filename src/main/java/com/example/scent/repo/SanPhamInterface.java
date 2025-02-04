package com.example.scent.repo;

import com.example.scent.entity.SanPham;
import com.example.scent.entity.Spct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SanPhamInterface extends JpaRepository<SanPham, Integer>{
    List<SanPham> findByTenContainingIgnoreCase(String ten);
    @Query(value = "select * from spct where id_san_pham = :id", nativeQuery = true)
    List<Spct> getAllSpctByIdSp(@Param("id") Integer id);
}

