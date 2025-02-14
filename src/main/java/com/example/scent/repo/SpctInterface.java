package com.example.scent.repo;

import com.example.scent.entity.Spct;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpctInterface extends JpaRepository<Spct, Integer>{

    @Query("select spct from Spct spct where spct.muiHuong.tenMuiHuong like :tenMuiHuong")
    List<Spct> findAllByMuiHuong(String tenMuiHuong);

    @Query(value = "SELECT s\n" +
            "FROM spct \n" +
            "WHERE id_san_pham =:idSanPham", nativeQuery = true)
    List<Spct> findByidSanPham(@Param("idSanPham") int idSanPham);
}

