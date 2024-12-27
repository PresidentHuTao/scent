package com.example.scent.repo;


import com.example.scent.entity.ThanhPhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ThanhPhanInterface extends JpaRepository<ThanhPhan, Integer>{
}
