package com.gonzaloproyectos.apis.tareas.app.entitys;

public enum Prioridad {
    URGENTE(0),
    MEDIA(1),
    BAJA(2);

    private Integer valor;

    private Prioridad(Integer valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
