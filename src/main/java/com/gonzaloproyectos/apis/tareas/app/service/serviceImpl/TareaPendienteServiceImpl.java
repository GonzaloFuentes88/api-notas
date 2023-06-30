package com.gonzaloproyectos.apis.tareas.app.service.serviceImpl;

import com.gonzaloproyectos.apis.tareas.app.dao.ITareaPendienteDao;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaPendienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TareaPendienteServiceImpl implements ITareaPendienteService {

    @Autowired
    ITareaPendienteDao tareaPendienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<TareaPendiente> findAll() {
        return tareaPendienteDao.findAll();
    }
}
