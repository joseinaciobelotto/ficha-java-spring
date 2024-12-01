package com.example.demo.repositories;

import com.example.demo.model.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichaRepositorio extends JpaRepository<Ficha,Integer> {

}

