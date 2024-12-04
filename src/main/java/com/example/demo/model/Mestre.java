package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmestre;

    @OneToMany(mappedBy = "mestre", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mesa> mesas;
    @Column(nullable = false, unique = true)
    private String nome;

    private String senha;


    /*
    @OneToMany
    @JoinColumn(name = "idmesa")
    private List<Mesa> mesas;  // Relacionamento com o mestre


    @OneToMany(mappedBy = "mestre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Mesa> mesas;  // Um mestre pode ter várias mesas
    */

    public Mestre() {
    }

    public Mestre(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    // Getters e Setters
    public int getIdmestre() {
        return idmestre;
    }

    public void setIdmestre(int idmestre) {
        this.idmestre = idmestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }*/
}