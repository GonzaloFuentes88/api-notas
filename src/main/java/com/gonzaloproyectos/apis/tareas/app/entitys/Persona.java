package com.gonzaloproyectos.apis.tareas.app.entitys;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona {
    private Long dni;
    private String nombre;
    private String apellido;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }
}
