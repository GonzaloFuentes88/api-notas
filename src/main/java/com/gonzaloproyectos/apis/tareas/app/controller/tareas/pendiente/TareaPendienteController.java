package com.gonzaloproyectos.apis.tareas.app.controller.tareas.pendiente;

import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaPendienteService;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.aspectj.weaver.reflect.InternalUseOnlyPointcutParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tarea/pendiente")
public class TareaPendienteController {

    private TareaPendienteDelegate delegate;

    public TareaPendienteDelegate getDelegate() {
        return delegate;
    }

    @Autowired
    private ITareaPendienteService tareaPendienteService;

    @GetMapping("/obtener/{id}")
    public ResponseEntity<List<TareaPendiente>> listarPendienteUser(@PathVariable Long id){
        return delegate.listarPendientesUser(id);
    }

    @GetMapping("/listar")
    public List<TareaPendiente> listarPendiente(){
        return tareaPendienteService.findAll();
    }

}
