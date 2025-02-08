package com.example.scent.repo;

import com.example.scent.entity.Spct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpctInterface extends JpaRepository<Spct, Integer>{
    @Query(value = "SELECT san_pham.ten,san_pham.id_danh_muc,spct.dung_tich,spct.don_gia\n" +
            "FROM spct join san_pham on spct.id_san_pham=san_pham.id\n" +
            "WHERE id_san_pham =:idSanPham", nativeQuery = true)
    Spct findByidSanPham(@Param("idSanPham") int idSanPham);
}

