package com.example.scent.repo;

import com.example.scent.entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PhieuGiamGiaInterface extends JpaRepository<PhieuGiamGia, Integer>{
}
