package com.example.demo.repositories;

import com.example.demo.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MesaRepositorio extends JpaRepository<Mesa, Integer> {
    List<Mesa> findByMestre_Idmestre(int idmestre); // Supondo que a coluna seja "idusuario" no banco
}
