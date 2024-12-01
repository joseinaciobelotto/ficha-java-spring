package com.example.demo.model;

import jakarta.persistence.*;
@Table
@Entity
public class Mesa {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmesa;
    private String nome;
    private String descricao;
    private String tema;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;


    public Mesa() {
    }

    public Mesa( String nome, String descricao, String tema) {

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
