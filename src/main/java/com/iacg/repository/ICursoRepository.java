package com.iacg.repository;

import com.iacg.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 *
 * @author IrvinCG
 */
@Repository("ICursoRepository")
public interface ICursoRepository extends JpaRepository<Curso, Long>{
    
    public Curso findByPrecio(double precio);
    
    public Curso findByPrecioAndNombre(double precio, String nombre);
    
    public List<Curso> findByNombreOrderByHoras(String nombre);
    
    public Curso findByNombreOrPrecio(String nombre, double precio);
    
}
