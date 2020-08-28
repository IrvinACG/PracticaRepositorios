package com.iacg.service.impl;

import com.iacg.entity.Curso;
import com.iacg.repository.ICursoRepository;
import com.iacg.service.ICursoService;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IrvinCG
 */
@Service
public class CursoServiceImpl implements ICursoService {

    private static final Log LOG = LogFactory.getLog(CursoServiceImpl.class);

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> listarCursos() {
        LOG.info("Call: " + "listarCursos()");
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardarCurso(Curso curso) {
        LOG.info("Call: " + "guardarCursos()");
        return cursoRepository.save(curso);
    }

    @Override
    public int eliminarCurso(Long idCurso) {
        LOG.info("Call: " + "EliminarCursos()");
        cursoRepository.deleteById(idCurso);
        return 0;
    }
}
