package com.example.demo.controller;


import com.example.demo.model.Ficha;
import com.example.demo.model.Mesa;
import com.example.demo.model.Usuario;
import com.example.demo.repositories.MesaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Mesa")
public class MesaController {

    @Autowired
    private MesaRepositorio mesaRepositorio;

    @GetMapping
    public List<Mesa> listarMesas() {
        return mesaRepositorio.findAll();
    }

    @GetMapping("/usuario")
    public List<Mesa> listarMesasPorUsuario(@RequestParam int idusuario) {
        return mesaRepositorio.findByUsuario_Idusuario(idusuario);
    }

    @GetMapping("/editarMeas")
    public Optional<Mesa> editarMeas(@RequestParam int id) {
        return mesaRepositorio.findById(id);
    }

    @PostMapping
    public Mesa escreverMesas(@RequestBody Mesa mesa) {
        return mesaRepositorio.save(mesa);
    }

    @DeleteMapping
    public String deletarMesa(@RequestParam int id) {
        mesaRepositorio.deleteById(id);
        return "Apagado";
    }
}
