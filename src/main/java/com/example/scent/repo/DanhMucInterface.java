package com.example.scent.repo;

import com.example.scent.entity.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DanhMucInterface extends JpaRepository<DanhMuc, Integer>{
}

