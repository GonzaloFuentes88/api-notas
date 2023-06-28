package com.gonzaloproyectos.apis.tareas.app.controller;

import com.gonzaloproyectos.apis.tareas.app.Dto.LoginDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.RegisterDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.UsuarioDTO;
import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> obtenerTodos(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario obtenerUno(@PathVariable(name = "id") Long id)
    {
        Usuario usuario = null;
        if(id > 0){
            usuario = usuarioService.findOne(id);
        }
        return usuario;
    }

    @PostMapping("/usuarios")
    public Usuario register(@RequestBody RegisterDTO registerDTO){
        return usuarioService.registerUser(registerDTO);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario update(@RequestBody UsuarioDTO usuarioDTO, @PathVariable Long id){
        return usuarioService.updateUser(usuarioDTO, id);
    }

    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable Long id){
            usuarioService.delete(id);
    }

    @PostMapping("/usuarios/login")
    public Usuario login(@RequestBody LoginDTO loginDTO)
    {
        Usuario usuarioActual = null;
        if(loginDTO != null){
             usuarioActual = usuarioService.loginUser(loginDTO);
        }
        return usuarioActual;
    }



    /*
    * @GetMapping("/usuarios/{id}")
    public Usuario index(@PathVariable(name = "id") Long id){
        if(id > 0){
            return usuarioService.findOne(id);
        }
        return null;
    }

    @GetMapping("/usuarios")
    public List<Usuario> index(){
        return usuarioService.findAll();
    }

    @PostMapping("/usuarios") //RequestBody indica que es un cuerpo enviado por request, es decir viene en formato JSON
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioActual = usuarioService.findOne(id);

        usuarioActual.setEmail(usuario.getEmail());
        usuarioActual.setUsername(usuario.getUsername());
        usuarioActual.setPassword(usuario.getPassword());
        usuarioActual.setFechaNacimiento(usuario.getFechaNacimiento());

        return usuarioService.save(usuarioActual);
    }

    @DeleteMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }

    * */
}
