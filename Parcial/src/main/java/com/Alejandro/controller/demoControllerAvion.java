package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alejandro.models.Avion;
import com.Alejandro.repository.IAvionRepository;


@Controller
@RequestMapping("/avion")
public class demoControllerAvion {
	
	
	 @Autowired
	    private IAvionRepository avionRepository;

	    @GetMapping("/motos")
	    public String listMotos(Model model) {
	        // Obtener todos los usuarios de la base de datos
	        List<Avion> aviones = avionRepository.findAll();

	        model.addAttribute("aviones", aviones);
	        return "avion-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
	    }


}
