package com.gonzaloproyectos.apis.tareas.app.service;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;

import java.util.List;

public interface ITareaRealizadaService {
    List<TareaRealizada> findAll();
}
