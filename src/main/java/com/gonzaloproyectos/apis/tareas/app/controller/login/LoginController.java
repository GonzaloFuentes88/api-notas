package com.gonzaloproyectos.apis.tareas.app.controller.login;

import com.gonzaloproyectos.apis.tareas.app.Dto.LoginDTO;
import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody LoginDTO loginDTO)
    {
        Usuario usuarioActual = null;
        if(loginDTO != null){
            usuarioActual = usuarioService.loginUser(loginDTO);
        }
        return ResponseEntity.ok(usuarioActual);
    }
}
