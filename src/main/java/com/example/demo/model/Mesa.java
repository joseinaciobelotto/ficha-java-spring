package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmesa;
    private String nome;
    private String descricao;
    private String tema;

    @OneToMany(mappedBy = "idmesa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ficha> fichas;
    @ManyToOne
    @JoinColumn(name = "idmestre")
    private Mestre mestre;

  /*  @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ficha> fichas;  // Uma mesa pode ter várias fichas*/

    public Mesa() {
    }

    public Mesa(String nome, String descricao, String tema, Mestre mestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.tema = tema;
        this.mestre = mestre;
    }

    // Getters e Setters
    public int getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Mestre getMestre() {
        return mestre;
    }

    public void setMestre(Mestre mestre) {
        this.mestre = mestre;
    }

    /*public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }*/
}