package com.indra.bbva.oracle.hr.controllers;

import com.indra.bbva.oracle.hr.entities.Aspirantes;
import com.indra.bbva.oracle.hr.entities.Countries;
import com.indra.bbva.oracle.hr.services.aspirantes.IAspirantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AspirantesController {

    @Autowired
    private IAspirantesService aspirantesService;

    @GetMapping("/aspirantes")
    public List<Aspirantes> index(HttpServletRequest request){
        return aspirantesService.findAll();
    }




}
