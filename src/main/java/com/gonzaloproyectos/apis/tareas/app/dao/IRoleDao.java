package com.gonzaloproyectos.apis.tareas.app.dao;

import com.gonzaloproyectos.apis.tareas.app.entitys.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleDao extends JpaRepository<Role,Long> {
}
