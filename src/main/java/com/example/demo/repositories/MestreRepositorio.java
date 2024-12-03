package com.example.demo.repositories;

import com.example.demo.model.Mestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MestreRepositorio extends JpaRepository<Mestre,Integer> {
    Optional<Mestre> findByNome(String nome);

}
