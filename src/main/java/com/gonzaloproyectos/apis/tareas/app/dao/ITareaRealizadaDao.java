package com.gonzaloproyectos.apis.tareas.app.dao;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaRealizadaDao extends JpaRepository<TareaRealizada,Long> {

}
