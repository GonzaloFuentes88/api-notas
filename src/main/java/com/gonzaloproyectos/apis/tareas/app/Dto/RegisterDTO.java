package com.gonzaloproyectos.apis.tareas.app.Dto;

import com.gonzaloproyectos.apis.tareas.app.entitys.Persona;
import com.gonzaloproyectos.apis.tareas.app.entitys.Role;

public class RegisterDTO {
    private Long dni;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String email;
    private Long idRole;

    public RegisterDTO() {
    }

    public RegisterDTO(Long dni, String nombre, String apellido, String username, String password, String email, Long idRole) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.email = email;
        this.idRole = idRole;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }
}
