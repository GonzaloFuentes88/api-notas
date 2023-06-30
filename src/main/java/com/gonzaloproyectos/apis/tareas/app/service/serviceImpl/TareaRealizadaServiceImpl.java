package com.gonzaloproyectos.apis.tareas.app.service.serviceImpl;

import com.gonzaloproyectos.apis.tareas.app.Dto.TareaFinalizadaDTO;
import com.gonzaloproyectos.apis.tareas.app.Exceptions.IdOutOfRangeException;
import com.gonzaloproyectos.apis.tareas.app.dao.ITareaPendienteDao;
import com.gonzaloproyectos.apis.tareas.app.dao.ITareaRealizadaDao;
import com.gonzaloproyectos.apis.tareas.app.dao.IUsuarioDao;
import com.gonzaloproyectos.apis.tareas.app.entitys.Tarea;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaPendiente;
import com.gonzaloproyectos.apis.tareas.app.entitys.TareaRealizada;
import com.gonzaloproyectos.apis.tareas.app.entitys.Usuario;
import com.gonzaloproyectos.apis.tareas.app.service.ITareaRealizadaService;
import com.gonzaloproyectos.apis.tareas.app.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TareaRealizadaServiceImpl implements ITareaRealizadaService {
    @Autowired
    private ITareaRealizadaDao tareaRealizadaDao;

    @Autowired
    private ITareaPendienteDao tareaPendienteDao;

    @Autowired
    private IUsuarioDao usuarioDao;


    @Override
    @Transactional(readOnly = true)
    public List<TareaRealizada> findAll() {
        return tareaRealizadaDao.findAll();
    }


    @Override
    @Transactional()
    public Optional<TareaRealizada> finalizarTarea(TareaFinalizadaDTO tareaFinalizadaDTO) throws IdOutOfRangeException{
        Optional<TareaRealizada> tareaReturn = Optional.empty();
        if (tareaFinalizadaDTO.getId() > 0){
            Tarea tarea = tareaPendienteDao.findById(tareaFinalizadaDTO.getId()).orElse(null);
            if(tarea != null){
                Usuario user = usuarioDao.findById(tarea.getUsuarioAsignado().getId()).orElse(null);
                TareaRealizada tareaRealizada = new TareaRealizada();
                tareaRealizada.setFechaCreacion(tarea.getFechaCreacion());
                tareaRealizada.setTitulo(tarea.getTitulo());
                tareaRealizada.setDescripcion(tarea.getDescripcion());
                tareaRealizada.setFechaVencimiento(tarea.getFechaVencimiento());
                tareaRealizada.setUsuarioAsignado(user);
                tareaRealizada.addAllComentarios(tareaFinalizadaDTO.getComentarios());
                tareaRealizada.setFechaFinalizacion(new Date());
                tareaRealizada.setEstado(false);

                tareaReturn = Optional.of(tareaRealizada);

                tareaPendienteDao.deleteById(tareaFinalizadaDTO.getId());
                assert user != null;
                usuarioDao.save(user);
            }
        }else{
            throw new IdOutOfRangeException();
        }
        return tareaReturn;
    }

}
