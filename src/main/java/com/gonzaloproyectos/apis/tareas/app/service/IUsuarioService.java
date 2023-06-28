package com.gonzaloproyectos.apis.tareas.app.service;

import com.gonzaloproyectos.apis.tareas.app.Dto.LoginDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.RegisterDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.UsuarioDTO;
import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> findAll();
    Usuario findOne(Long id);
    void delete(Long id);
    Usuario registerUser(RegisterDTO registerDTO);

    Usuario updateUser(UsuarioDTO usuarioDTO, Long id);

    Usuario loginUser(LoginDTO loginDTO);

}
