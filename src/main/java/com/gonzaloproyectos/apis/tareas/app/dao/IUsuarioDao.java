package com.gonzaloproyectos.apis.tareas.app.dao;

import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsernameAndPassword(String email, String password);
}
