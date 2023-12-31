package com.gonzaloproyectos.apis.tareas.app.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tareas_realizadas")
public class TareaRealizada extends Tarea implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CollectionTable(name = "comentarios_tarea_realizada")
    @ElementCollection
    @Column(name = "comentario")
    private List<Comentario> comentarios;

    @Column(name = "fecha_finalizacion")
    private Date fechaFinalizacion;


    public TareaRealizada() {
        this.setFechaVencimiento(new Date());
        this.setFechaCreacion(new Date());
    }

    public void addAllComentarios(List<Comentario> comentarios){
        for (Comentario c:comentarios) {
            c.setTareaRealizada(this);
            this.comentarios.add(c);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
