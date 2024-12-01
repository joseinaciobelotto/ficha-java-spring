package com.example.demo.controller;


import com.example.demo.model.Ficha;
import com.example.demo.repositories.FichaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Ficha")
public class FichaController {

    @Autowired
    private FichaRepositorio fichaRepositorio;

   /* @GetMapping
    public String helloWorld()
    {
        return "Oi, isto é apenas uma rota de teste!";
    }
*/
    @PostMapping
    public Ficha criarFicha(@RequestBody Ficha ficha)
    {

    return fichaRepositorio.save(ficha);
    }

    @GetMapping
    public List<Ficha> listarFichas()
    {
        return fichaRepositorio.findAll();
    }

    @DeleteMapping
    public String deletarFicha(@RequestParam int id) {
        fichaRepositorio.deleteById(id);
        return "Apagado";
    }



    @PutMapping
    public Ficha editarFichas( @RequestBody int id )
    {
        Optional<Ficha> ficha = fichaRepositorio.findById(id);

        return  criarFicha(ficha.get());
    }
}
