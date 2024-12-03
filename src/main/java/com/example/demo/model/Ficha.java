package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idficha;
    private String nome;
    private String classe;
    private String descricao;
    private int[] atributo;
    private String[] habilidades;

    @ManyToOne
    @JoinColumn(name = "idmesa")
    private Mesa mesa;

    public Ficha() {
    }

    public Ficha(String nome, String classe, String descricao, int[] atributo, String[] habilidades, Mesa mesa) {
        this.nome = nome;
        this.classe = classe;
        this.descricao = descricao;
        this.atributo = atributo;
        this.habilidades = habilidades;
        this.mesa = mesa;
    }

    // Getters e Setters
    public int getIdficha() {
        return idficha;
    }

    public void setIdficha(int idficha) {
        this.idficha = idficha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int[] getAtributo() {
        return atributo;
    }

    public void setAtributo(int[] atributo) {
        this.atributo = atributo;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}