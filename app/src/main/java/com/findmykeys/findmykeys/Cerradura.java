package com.findmykeys.findmykeys;

public class Cerradura {
    private int idCerradura ;
    private String nombreCerradura;
    private boolean estado;

    public Cerradura(int idCerradura, String nombreCerradura, boolean estado) {
        this.idCerradura = idCerradura;
        this.nombreCerradura = nombreCerradura;
        this.estado = estado;
    }

    public Cerradura(){}

    public int getIdCerradura() {
        return idCerradura;
    }

    public void setIdCerradura(int idCerradura) {
        this.idCerradura = idCerradura;
    }

    public String getNombreCerradura() {
        return nombreCerradura;
    }

    public void setNombreCerradura(String nombreCerradura) {
        this.nombreCerradura = nombreCerradura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
