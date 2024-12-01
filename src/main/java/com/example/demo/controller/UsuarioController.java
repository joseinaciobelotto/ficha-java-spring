package com.example.demo.controller;


import com.example.demo.model.Usuario;
import com.example.demo.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping("/Oi")
    public String helloWorld()
    {
        return "Oi, isto é apenas uma rota de teste!";
    }

    @GetMapping
    public List<Usuario> listarUsuarios()
    {
        return usuarioRepositorio.findAll();
    }

    @PostMapping
    public Usuario escreverUsuarios(@RequestBody Usuario usuario)
    {
        return usuarioRepositorio.save(usuario);
    }

    @DeleteMapping
    public String deletarUsuario(@RequestParam int id) {
        usuarioRepositorio.deleteById(id);
        return "Apagado";
    }

}