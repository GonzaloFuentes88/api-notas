package com.gonzaloproyectos.apis.tareas.app.dao;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaPendienteDao extends JpaRepository<TareaPendiente,Long> {
}
