package com.iacg.converter;

import com.iacg.entity.Curso;
import com.iacg.model.CursoModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author IrvinCG
 */
@Component("cursoConverter")
public class CursoConverter {
    
    //Entity --> Model
    public CursoModel entityToModel(Curso curso){
        CursoModel cursoModel = new CursoModel();
        cursoModel.setNombre(curso.getNombre());
        cursoModel.setDescripcion(curso.getDescripcion());
        cursoModel.setPrecio(curso.getPrecio());
        cursoModel.setHoras(curso.getHoras());
        return cursoModel;
    }
    
    //Model --> Entity
    public Curso modelToEntity(CursoModel cursoModel){
        Curso curso = new Curso();
        curso.setNombre(cursoModel.getNombre());
        curso.setDescripcion(cursoModel.getDescripcion());
        curso.setPrecio(cursoModel.getPrecio());
        curso.setHoras(cursoModel.getHoras());
        return curso;
    }
}
