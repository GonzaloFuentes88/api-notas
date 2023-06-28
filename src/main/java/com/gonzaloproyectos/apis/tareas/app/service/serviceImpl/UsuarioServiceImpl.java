package com.gonzaloproyectos.apis.tareas.app.service.serviceImpl;

import com.gonzaloproyectos.apis.tareas.app.Dto.LoginDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.RegisterDTO;
import com.gonzaloproyectos.apis.tareas.app.Dto.UsuarioDTO;
import com.gonzaloproyectos.apis.tareas.app.dao.IUsuarioDao;
import com.gonzaloproyectos.apis.tareas.app.entitys.Role;
import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;
import com.gonzaloproyectos.apis.tareas.app.service.IRoleService;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao IUsuarioDao;

    @Autowired
    private IRoleService roleService;

    @Override
    public List<Usuario> findAll() {
        return IUsuarioDao.findAll();
    }

    @Override
    public Usuario findOne(Long id) {
        return IUsuarioDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        IUsuarioDao.deleteById(id);
    }

    @Override
    public Usuario registerUser(RegisterDTO registerDTO) {
        Usuario user = new Usuario();
        Role role = roleService.findOne(registerDTO.getIdRole());

        user.setNombre(registerDTO.getNombre());
        user.setApellido(registerDTO.getApellido());
        user.setDni(registerDTO.getDni());
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());

        if(role != null){
            user.setRole(role);
        }else{
            user.setRole(roleService.findOne(1L));
        }

        return IUsuarioDao.save(user);
    }

    @Override
    public Usuario updateUser(UsuarioDTO usuarioDTO, Long id) {
        Usuario user = IUsuarioDao.findById(id).orElse(null);

        if(user==null){
            return user;
        }
        user.setUsername(usuarioDTO.getUsername());
        user.setEmail(usuarioDTO.getEmail());
        user.setRole(roleService.findOne(usuarioDTO.getIdRole()));
        return IUsuarioDao.save(user);
    }

    @Override
    public Usuario loginUser(LoginDTO loginDTO) {
        return IUsuarioDao.findByUsernameAndPassword(loginDTO.getUsername(),loginDTO.getPassword()).orElse(null);
    }
}
