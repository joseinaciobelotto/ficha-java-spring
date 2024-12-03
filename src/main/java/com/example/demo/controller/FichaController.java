package com.example.demo.controller;


import com.example.demo.model.Ficha;
import com.example.demo.model.Mesa;
import com.example.demo.repositories.FichaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Ficha")
public class FichaController {

    @Autowired
    private FichaRepositorio fichaRepositorio;


    @GetMapping
    public List<Ficha> listarFichas()
    {
        return fichaRepositorio.findAll();
    }

    @GetMapping("/editarFichas")
    public Optional<Ficha> editarFichas(@RequestParam int id)
    {
        return fichaRepositorio.findById(id);
    }

    @PostMapping
    public Ficha criarFicha(@RequestBody Ficha ficha)
    {
        return fichaRepositorio.save(ficha);
    }

    @GetMapping("/mesa")
    public List<Ficha> listarFichaporMesa(@RequestParam int idmesa) {
         return fichaRepositorio.findByMesa_Idmesa(idmesa);
    }


    @DeleteMapping
    public String deletarFicha(@RequestParam int id) {
        fichaRepositorio.deleteById(id);
        return "Apagado";
    }




}
