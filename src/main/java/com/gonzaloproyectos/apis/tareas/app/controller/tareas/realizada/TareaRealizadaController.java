package com.gonzaloproyectos.apis.tareas.app.controller.tareas.realizada;

import com.gonzaloproyectos.apis.tareas.app.Dto.TareaFinalizadaDTO;
import com.gonzaloproyectos.apis.tareas.app.Exceptions.IdOutOfRangeException;
import com.gonzaloproyectos.apis.tareas.app.entitys.Tarea;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaRealizadaService;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tarea/realizada")
public class TareaRealizadaController {

    @Autowired
    private ITareaRealizadaService tareaRealizadaService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<TareaRealizada>> listarRealizadas(){
        return ResponseEntity.ok(tareaRealizadaService.findAll());
    }

    @GetMapping("/obtener/{id}")
    public ResponseEntity<List<TareaRealizada>> listarRealizadaUser(@PathVariable Long id){
        List<TareaRealizada> tList = new ArrayList<>();
        if(id > 0){
            tList = usuarioService.findOne(id).getTareasRealizadas();
        }
        return ResponseEntity.ok(tList);
    }

    @PostMapping("/finalizar")
    public ResponseEntity<TareaRealizada> tareaRealizada(@RequestBody TareaFinalizadaDTO tareaFinalizadaDTO) {
        Tarea tarea;
        try {
            tarea = tareaRealizadaService.finalizarTarea(tareaFinalizadaDTO).orElse(null);
        } catch (IdOutOfRangeException idOutOfRangeException) {
            return new ResponseEntity("Id fuera de rango",HttpStatus.NOT_FOUND);
        }catch (NullPointerException nullPointerException){
            return new ResponseEntity("Tarea no existe o atributo null",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().build();
    }

}
