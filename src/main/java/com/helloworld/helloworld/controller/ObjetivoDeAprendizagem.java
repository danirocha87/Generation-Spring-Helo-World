package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo de Aprendizagem")
public class ObjetivoDeAprendizagem{
	
	@GetMapping
	
	public String Objetivos() {
		return "Orientação ao detalhe"
				+ "<li>Persistência<br>"
				+"<li>Mentalidade de crescimento";
		
	}
	
	
}
	

