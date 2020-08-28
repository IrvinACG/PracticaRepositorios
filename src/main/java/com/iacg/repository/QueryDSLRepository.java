package com.iacg.repository;
import com.iacg.entity.Curso;
import com.iacg.entity.QCurso;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IrvinCG
 */
@Repository
public class QueryDSLRepository {
    
    private QCurso qCurso = QCurso.curso;
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Curso> find(){
        JPAQuery<Curso> query = new JPAQuery<Curso>(em);
        return query.select(qCurso).from(qCurso).orderBy(qCurso.horas.desc()).fetch();
    }
    
}
