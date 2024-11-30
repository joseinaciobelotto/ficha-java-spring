package com.example.demo.model;

public class Usuario {

    private int idusuario;
    private String nome;
    private String senha;

    public Usuario(int idusuario, String nome, String senha)
    {
        this.idusuario = idusuario;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario( String nome, String senha)
    {
        this.nome = nome;
        this.senha = senha;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
