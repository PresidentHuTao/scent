package com.example.scent.repo;

import com.example.scent.entity.DungTich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DungTichInterface extends JpaRepository<DungTich, Integer>{
}
