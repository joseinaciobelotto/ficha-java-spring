package com.example.demo.controller;


import com.example.demo.model.Mestre;
import com.example.demo.repositories.MestreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Mestre")
public class MestreController {

    @Autowired
    private MestreRepositorio mestreRepositorio;

    @GetMapping("/Oi")
    public String helloWorld()
    {
        return "Oi, isto é apenas uma rota de teste!";
    }

    @GetMapping
    public List<Mestre> listarMestre()
    {
        return mestreRepositorio.findAll();
    }

    @GetMapping("/editarMestre")
    public Optional<Mestre> editarUMestre(@RequestParam int id)
    {
        return mestreRepositorio.findById(id);
    }

    @PostMapping
    public Mestre escreverMestre(@RequestBody Mestre mestre)
    {
        return mestreRepositorio.save(mestre);
    }

    @DeleteMapping
    public String deletarMestre(@RequestParam int id) {
        mestreRepositorio.deleteById(id);
        return "Apagado";
    }

    @PostMapping("/login")
    public String login(@RequestBody Mestre mestre) {
        // Procura o Mestre pelo nome no banco
        Optional<Mestre> mestreEncontrado = mestreRepositorio.findByNome(mestre.getNome());

        if (mestreEncontrado.isPresent()) {
            // Verifica se a senha coincide
            if (mestreEncontrado.get().getSenha().equals(mestre.getSenha())) {
                return "Login bem-sucedido!";
            } else {
                return "Senha incorreta!";
            }
        } else {
            return "Mestre não encontrado!";
        }
    }

}