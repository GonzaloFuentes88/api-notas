package com.gonzaloproyectos.apis.tareas.app.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
    @OneToMany(mappedBy = "usuarioAsignado",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TareaRealizada> tareasRealizadas;
    @OneToMany(mappedBy = "usuarioAsignado",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TareaPendiente> tareasPendientes;

    public Usuario() {
        this.tareasPendientes = new ArrayList<>();
        this.tareasRealizadas = new ArrayList<>();
    }

    public Usuario(Long id, String username, String password, String email, Role role, List<TareaRealizada> tareasRealizadas, List<TareaPendiente> tareasPendientes) {
        this();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.tareasRealizadas = tareasRealizadas;
        this.tareasPendientes = tareasPendientes;
    }

    @PrePersist
    public void prePersist(){
        this.tareasPendientes = new ArrayList<>();
        this.tareasRealizadas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<TareaRealizada> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<TareaRealizada> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public List<TareaPendiente> getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(List<TareaPendiente> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

}
