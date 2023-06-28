package com.gonzaloproyectos.apis.tareas.app.service;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;

import java.util.List;

public interface ITareaPendienteService {
    List<TareaPendiente> findAll();
}
