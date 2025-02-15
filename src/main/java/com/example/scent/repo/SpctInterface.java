package com.example.scent.repo;

import com.example.scent.entity.Spct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpctInterface extends JpaRepository<Spct, Integer>{
    @Query(value = "SELECT s\n" +
            "FROM spct \n" +
            "WHERE id_san_pham =:idSanPham", nativeQuery = true)
    List<Spct> findByidSanPham(@Param("idSanPham") int idSanPham);
}

