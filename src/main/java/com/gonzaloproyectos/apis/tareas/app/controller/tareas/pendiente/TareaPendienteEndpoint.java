package com.gonzaloproyectos.apis.tareas.app.controller.tareas.pendiente;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TareaPendienteEndpoint {


    @GetMapping("/obtener/{id}")
    public ResponseEntity<List<TareaPendiente>> listarPendienteUser(@PathVariable Long id){
        return new TareaPendienteController().getDelegate().listarPendientesUser(id);
    }
}
