package com.gonzaloproyectos.apis.tareas.app.service.serviceImpl;

import com.gonzaloproyectos.apis.tareas.app.dao.ITareaRealizadaDao;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaRealizadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaRealizadaServiceImpl implements ITareaRealizadaService {
    @Autowired
    private ITareaRealizadaDao tareaRealizadaDao;


    @Override
    public List<TareaRealizada> findAll() {
        return tareaRealizadaDao.findAll();
    }


}
