package com.indra.bbva.oracle.hr.controllers;

import com.indra.bbva.oracle.hr.entities.Aspirantes;
import com.indra.bbva.oracle.hr.entities.Countries;
import com.indra.bbva.oracle.hr.services.aspirantes.IAspirantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

@RestController
public class AspirantesController {

    @Autowired
    private IAspirantesService aspirantesService;

    @GetMapping("/aspirantes")
    public List<Aspirantes> index(HttpServletRequest request){
        return aspirantesService.findAll();
    }

    @GetMapping("/aspirantes/{dato}")
    public Set<Aspirantes> findByName(HttpServletRequest request, @PathVariable String dato){
        return aspirantesService.findByName(dato);
    }
    @GetMapping("/aspirantes/filtrar/{dato}")
    public Set<Aspirantes> filtro(@PathVariable String dato){
      return aspirantesService.filtro(dato);
    }





}
