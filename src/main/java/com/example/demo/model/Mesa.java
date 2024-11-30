package com.example.demo.model;

public class Mesa {
    private int idumesa;
    private String nome;
    private String descricao;
    private String tema;

    public Mesa(int idumesa, String nome, String descricao, String tema) {
        this.idumesa = idumesa;
        this.nome = nome;
        this.descricao = descricao;
        this.tema = tema;
    }

    public int getIdumesa() {
        return idumesa;
    }

    public void setIdumesa(int idumesa) {
        this.idumesa = idumesa;
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
