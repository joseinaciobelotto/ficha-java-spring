package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Ficha implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idficha;
    private String nome;
    private String classe;
    private String Descricao;
    private int[] Atributo;
    private String[] Habilidades;
    private int idusuario;
    private int idmesa;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idmesa")
    private Mesa mesa;


    public Ficha(int idficha, String nome, String classe, String descricao, int[] atributo, String[] habilidades, int idusuario, int idmesa) {
        this.idficha = idficha;
        this.nome = nome;
        this.classe = classe;
        Descricao = descricao;
        Atributo = atributo;
        Habilidades = habilidades;
        this.idusuario = idusuario;
        this.idmesa = idmesa;
    }

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
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int[] getAtributo() {
        return Atributo;
    }

    public void setAtributo(int[] atributo) {
        Atributo = atributo;
    }

    public String[] getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        Habilidades = habilidades;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }
}
