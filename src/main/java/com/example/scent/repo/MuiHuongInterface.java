package com.example.scent.repo;

import com.example.scent.entity.MuiHuong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MuiHuongInterface extends JpaRepository<MuiHuong, Integer>{
}

