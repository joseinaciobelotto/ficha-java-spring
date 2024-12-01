package com.example.demo.repositories;

import com.example.demo.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepositorio extends JpaRepository<Mesa, Integer> {
}
