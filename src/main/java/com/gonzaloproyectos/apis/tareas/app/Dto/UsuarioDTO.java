package com.gonzaloproyectos.apis.tareas.app.Dto;

public class UsuarioDTO {
    private String username;
    private String password;
    private String email;

    private Long idRole;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String username, String password, String email, Long idRole) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.idRole = idRole;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
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
}
