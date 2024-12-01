package com.example.demo.model;

import jakarta.persistence.*;

@Table
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;
    private String nome;
    private String senha;

    public Usuario() {
    }
    public Usuario(String nome, String senha)
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
