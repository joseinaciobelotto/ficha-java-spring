package com.example.demo.controller;


import com.example.demo.model.Mesa;
import com.example.demo.model.Usuario;
import com.example.demo.repositories.MesaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ficha")
public class MesaController {

    @Autowired
    private MesaRepositorio mesaRepositorio;

    @GetMapping("/Oi")
    public String helloWorld()
    {
        return "Oi, isto é apenas uma rota de teste!";
    }

    @GetMapping
    public List <Mesa> listarMeas()
    {
        return mesaRepositorio.findAll();
    }

    @PostMapping
    public Mesa escreverMesas(@RequestBody Mesa mesa)
    {
        return mesaRepositorio.save(mesa);
    }

    @DeleteMapping
    public String deletarMesa(@RequestParam int id) {
        mesaRepositorio.deleteById(id);
        return "Apagado";
    }

}
