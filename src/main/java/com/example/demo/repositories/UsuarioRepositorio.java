package com.example.demo.repositories;

import com.example.demo.model.Mesa;
import com.example.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByNome(String nome);

}
