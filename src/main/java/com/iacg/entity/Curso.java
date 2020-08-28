package com.iacg.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author IrvinCG
 */
@Data
@Entity
@Table(name = "curso")
public class Curso implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;
    
    @NotNull
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    
    @NotNull
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    
    @NotNull
    @Column(name = "precio", nullable = false)
    private double precio;
    
    @NotNull
    @Column(name = "horas", nullable = false)
    private int horas;
}
