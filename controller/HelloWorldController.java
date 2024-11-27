package com.generation.Hello.World.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
@GetMapping("/bsm")
public String bsm() {
	return "Mentalidades:\n"
			+ "1- Orientação ao futuro\n"
			+ "2- Comunicação\n"
			+ "3- Trabalho em equipe\n"
			+ "4- Proatividade\n"
			+ "5- Trabalho Autônomo\n"
			+ "6- Atenção aos detalhes\n"
			+ "7- Persistência\n"
			+ "8- Mentalidade de crescimento\n"
			+ "9- Responsabilidade pessoal\n"
			+ "10- Habilidade";
}

@GetMapping("/objetivos-aprendizagem")
public String objetivosAprendizagem() {
	return "Objetivos de Aprendizagem dessa semana:\n"
			+ "1- Revisar JAVA"
			+ "2- Revisar BD"
			+ "3- Aprender protocolo HTTP e Spring";
	
}
	
}
