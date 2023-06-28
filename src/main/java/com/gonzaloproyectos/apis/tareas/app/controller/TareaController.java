package com.gonzaloproyectos.apis.tareas.app.controller;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaPendienteService;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaRealizadaService;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private ITareaPendienteService tareaPendienteService;

    @Autowired
    private ITareaRealizadaService tareaRealizadaService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/listar/pendientes/{id}")
    public List<TareaPendiente> listarPendienteUser(@PathVariable Long id){
        List<TareaPendiente> tList = new ArrayList<>();
        if(id > 0){
            tList = usuarioService.findOne(id).getTareasPendientes();
        }
        return tList;
    }

    @GetMapping("/listar/pendientes")
    public List<TareaPendiente> listarPendiente(){
        return tareaPendienteService.findAll();
    }

    @GetMapping("/listar/realizadas")
    public List<TareaRealizada> listarRealizadas(){
        return tareaRealizadaService.findAll();
    }

    @GetMapping("/listar/realizadas/{id}")
    public List<TareaRealizada> listarRealizadaUser(@PathVariable Long id){
        List<TareaRealizada> tList = new ArrayList<>();
        if(id > 0){
            tList = usuarioService.findOne(id).getTareasRealizadas();
        }
        return tList;
    }
}
