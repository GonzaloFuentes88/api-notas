package com.gonzaloproyectos.apis.tareas.app.Dto;


import com.gonzaloproyectos.apis.tareas.app.entitys.Comentario;

import java.util.List;

public class TareaFinalizadaDTO {
    private Long id;
    private List<Comentario> comentarios;

    public TareaFinalizadaDTO(){

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

}
