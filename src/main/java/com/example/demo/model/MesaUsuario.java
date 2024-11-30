package com.example.demo.model;

import jakarta.persistence.*;

public class MesaUsuario {
    private int idmesausuario;
    private boolean adm;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idmesa")
    private Mesa mesa;


    public MesaUsuario(boolean adm) {
        this.adm = adm;
    }




    public int getIdmesausuario() {
        return idmesausuario;
    }
    public void setIdmesausuario(int idmesausuario) {
        this.idmesausuario = idmesausuario;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public Mesa getIdmesa() {
        return mesa;
    }

    public void setIdmesa(Mesa idmesa) {
        this.mesa = idmesa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


}
