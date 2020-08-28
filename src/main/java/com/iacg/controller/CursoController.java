package com.iacg.controller;

import com.iacg.configuration.Pages;
import com.iacg.converter.CursoConverter;
import com.iacg.entity.Curso;
import com.iacg.model.CursoModel;
import com.iacg.repository.QueryDSLRepository;
import com.iacg.service.ICursoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author IrvinCG
 */
@Controller
@RequestMapping("/cursos")
public class CursoController {

    private static final Log LOG = LogFactory.getLog(CursoController.class);

    @Autowired
    private ICursoService cursoService;
    
    @Autowired
    private CursoConverter cursoConverter;
    
    @Autowired
    private QueryDSLRepository queryDSLRepository;

    @GetMapping("/")
    public ModelAndView getCursos() {
        LOG.info("Call: " + "getCursos");
        ModelAndView model = new ModelAndView(Pages.PAGE_CURSOS);
        model.addObject("cursos", cursoService.listarCursos());
        model.addObject("curso", new CursoModel());
        return model;
    }

    @PostMapping("/guardar")
    public String guardarCurso(@ModelAttribute("curso") CursoModel cursoModel) {
        LOG.info("Call: " + "guardarCurso() --Param: " + cursoModel.toString());
        cursoService.guardarCurso(cursoConverter.modelToEntity(cursoModel));
        return "redirect:/cursos/";
    }
    
    @GetMapping("/querydls")
    public ModelAndView getCursosQueryDsl() {
        LOG.info("Call: " + "getCursos");
        ModelAndView model = new ModelAndView(Pages.PAGE_CURSOS);
        model.addObject("cursos", queryDSLRepository.find());
        model.addObject("curso", new CursoModel());
        return model;
    }
}
