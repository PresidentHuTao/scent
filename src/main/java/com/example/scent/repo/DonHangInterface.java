package com.example.scent.repo;

import com.example.scent.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DonHangInterface extends JpaRepository<DonHang, Integer>{
}
