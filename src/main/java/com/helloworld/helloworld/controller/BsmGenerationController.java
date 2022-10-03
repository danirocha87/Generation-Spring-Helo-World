package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSMs Generation")
public class BsmGenerationController {
	
	@GetMapping
	
	public String bsmGeneration(){
		return "As oito BSMs da Generation:"		
                +"<li>Comunicação<br>"
                + "<li>Proatividade<br>"
                +"<li>Orientação ao detalhe<br>"
                + "<li>Proatividade<br>"
				+ "<li>Trabalho em equipe<br>"
                + "<li>Orientação ao futuro<br>"
                + "<li>Responsabilidade pessoal<br>"
                + "<li>Mentalidade de crescimento<br>"
                + "<li>Persistência";
		
	}


	
}
