package com.example.demo.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Mesa {
    private int idmesa;
    private String nome;
    private String descricao;
    private String tema;
       public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    public Mesa(int idumesa, String nome, String descricao, String tema) {
        this.idmesa = idumesa;
        this.nome = nome;
        this.descricao = descricao;
        this.tema = tema;
    }

    public int getIdumesa() {
        return idmesa;
    }

    public void setIdumesa(int idumesa) {
        this.idmesa = idumesa;
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
}
