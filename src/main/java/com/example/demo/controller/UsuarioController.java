package com.example.demo.controller;


import com.example.demo.model.Usuario;
import com.example.demo.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/editarUsuarios")
    public Optional<Usuario> editarUsuarios(@RequestParam int id)
    {
        return usuarioRepositorio.findById(id);
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

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        // Procura o usuário pelo nome no banco
        Optional<Usuario> usuarioEncontrado = usuarioRepositorio.findByNome(usuario.getNome());

        if (usuarioEncontrado.isPresent()) {
            // Verifica se a senha coincide
            if (usuarioEncontrado.get().getSenha().equals(usuario.getSenha())) {
                return "Login bem-sucedido!";
            } else {
                return "Senha incorreta!";
            }
        } else {
            return "Usuário não encontrado!";
        }
    }

}