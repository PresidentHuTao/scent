package com.example.scent.repo;

import com.example.scent.entity.SanPham;
import com.example.scent.entity.Spct;
import com.example.scent.respone.SanPhamRespone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SanPhamInterface extends JpaRepository<SanPham, Integer> {

    @Query(value = """
            select sp.id, sp.ten, sp.mo_ta, th.ten_thuong_hieu, dm.ten_danh_muc from san_pham sp
            join thuong_hieu th on sp.id_thuong_hieu = th.id
            join danh_muc dm on sp.id_danh_muc = dm.id
            join spct spct on sp.id = spct.id_san_pham
            join mui_huong mh on spct.id_mui_huong = mh.id
            where mh.ten_mui_huong like :tenMuiHuong
            """, nativeQuery = true)
    List<SanPhamRespone> findAllByMuiHuong(@Param("tenMuiHuong") String tenMuiHuong);

}

