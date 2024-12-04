package com.example.demo.repositories;

import com.example.demo.model.Ficha;
import com.example.demo.model.Mesa;
import com.example.demo.model.Mestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FichaRepositorio extends JpaRepository<Ficha, Integer> {
    List<Ficha> findByMesa_Idmesa(int idmesa); // Retorna uma lista de Fichas

}

