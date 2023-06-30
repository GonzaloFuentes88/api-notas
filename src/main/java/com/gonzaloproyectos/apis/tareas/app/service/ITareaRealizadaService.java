package com.gonzaloproyectos.apis.tareas.app.service;

import com.gonzaloproyectos.apis.tareas.app.Dto.TareaFinalizadaDTO;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;

import java.util.List;
import java.util.Optional;

public interface ITareaRealizadaService {
    List<TareaRealizada> findAll();

    Optional<TareaRealizada> finalizarTarea(TareaFinalizadaDTO tareaFinalizadaDTO);
}
