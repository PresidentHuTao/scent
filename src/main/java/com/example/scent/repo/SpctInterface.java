package com.example.scent.repo;

import com.example.scent.entity.Spct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpctInterface extends JpaRepository<Spct, Integer>{
}

