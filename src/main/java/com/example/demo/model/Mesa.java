package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmesa;
    private String nome;
    private String descricao;
    private String tema;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    @JsonIgnore
    private Usuario usuario;  // Relacionamento com o usuário

  /*  @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ficha> fichas;  // Uma mesa pode ter várias fichas
*/
    public Mesa() {
    }

    public Mesa(String nome, String descricao, String tema, Usuario usuario) {
        this.nome = nome;
        this.descricao = descricao;
        this.tema = tema;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }*/
}
