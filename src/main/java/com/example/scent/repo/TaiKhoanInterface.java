package com.example.scent.repo;

import com.example.scent.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanInterface extends JpaRepository<TaiKhoan, Integer>{
}
