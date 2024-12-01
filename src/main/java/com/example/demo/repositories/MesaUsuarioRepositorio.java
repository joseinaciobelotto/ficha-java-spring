package com.example.demo.repositories;

import com.example.demo.model.Mesa;
import com.example.demo.model.MesaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaUsuarioRepositorio extends JpaRepository<MesaUsuario, Integer> {
}
