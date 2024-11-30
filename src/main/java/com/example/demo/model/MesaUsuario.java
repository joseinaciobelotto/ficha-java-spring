package com.example.demo.model;

public class MesaUsuario {
    private int idusuario;
    private int mesa;
    private boolean adm;

    public MesaUsuario(int idusuario, int mesa, boolean adm) {
        this.idusuario = idusuario;
        this.mesa = mesa;
        this.adm = adm;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
}
