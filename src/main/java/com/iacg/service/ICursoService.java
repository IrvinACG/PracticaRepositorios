package com.iacg.service;

import com.iacg.entity.Curso;
import java.util.List;

/**
 *
 * @author IrvinCG
 */
public interface ICursoService {

    public List<Curso> listarCursos();
    
    public Curso guardarCurso(Curso curso);
    
    public int eliminarCurso(Long idCurso);
    
}
