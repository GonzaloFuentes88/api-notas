package com.gonzaloproyectos.apis.tareas.app.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "comentarios")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tarea")
    @JsonIgnore
    private TareaRealizada tareaRealizada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TareaRealizada getTareaRealizada() {
        return tareaRealizada;
    }

    public void setTareaRealizada(TareaRealizada tareaRealizada) {
        this.tareaRealizada = tareaRealizada;
    }
}

