package com.gonzaloproyectos.apis.tareas.app.controller.tareas.pendiente;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class TareaPendienteDelegate {

    @Autowired
    private IUsuarioService usuarioService;

    public ResponseEntity<List<TareaPendiente>> listarPendientesUser(Long id){
        List<TareaPendiente> tList = new ArrayList<>();

        if(id > 0){
            tList = usuarioService.findOne(id).getTareasPendientes();
        }
        return ResponseEntity.ok(tList);
    }
}
