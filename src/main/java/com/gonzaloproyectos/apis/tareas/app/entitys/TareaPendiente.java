package com.gonzaloproyectos.apis.tareas.app.entitys;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tareas_pendientes")
public class TareaPendiente extends Tarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Prioridad prioridad;

    public TareaPendiente() {
        this.setFechaVencimiento(new Date());
        this.setFechaCreacion(new Date());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}
