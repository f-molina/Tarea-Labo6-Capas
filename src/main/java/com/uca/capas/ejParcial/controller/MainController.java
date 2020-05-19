package com.uca.capas.ejParcial.controller;

import java.util.List;
import com.uca.capas.ejParcial.domain.Contribuyente;
import com.uca.capas.ejParcial.domain.Importancia;
import com.uca.capas.ejParcial.service.ContribuyenteService;
import com.uca.capas.ejParcial.service.ImportanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private ContribuyenteService contribuyenteService;

    @Autowired
    private ImportanciaService importanciaService;

    //form
    @RequestMapping("/inicio")
    public ModelAndView nuevoContribuyente() {
        ModelAndView mav = new ModelAndView();
        List<Importancia> importancias = importanciaService.findAll();
        mav.addObject("contribuyentes", new Contribuyente());
        mav.addObject("importancias", importancias);
        mav.setViewName("index");

        return mav;
    }

    //listado contribuyentes
    @RequestMapping("/listado")
    public ModelAndView listadoContribuyentes() {
        ModelAndView mav = new ModelAndView();
        List<Contribuyente> contribuyentes = null;
        try {
            contribuyentes = contribuyenteService.findAll();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        mav.addObject("contribuyentes", contribuyentes);
        mav.setViewName("listado");

        return mav;
    }
 
    @RequestMapping("/insertarContribuyente")
    public ModelAndView guardarContribuyente(@ModelAttribute Contribuyente contribuyente) {
        ModelAndView mav = new ModelAndView();
        contribuyenteService.save(contribuyente);
        mav.addObject("listado");
        mav.setViewName("exito");

        return mav;
    }
}