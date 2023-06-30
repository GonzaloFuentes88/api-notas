package com.gonzaloproyectos.apis.tareas.app.service.serviceImpl;

import com.gonzaloproyectos.apis.tareas.app.dao.IRoleDao;
import com.gonzaloproyectos.apis.tareas.app.entitys.Role;
import com.gonzaloproyectos.apis.tareas.app.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao IRoleDao;

    @Override
    @Transactional(readOnly = true)
    public Role findOne(Long id) {
        return IRoleDao.findById(id).orElse(null);
    }
}
