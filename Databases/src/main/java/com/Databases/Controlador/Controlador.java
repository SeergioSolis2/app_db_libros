package com.Databases.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Databases.Models.Perfiles;
import com.Databases.Repositorio.Repositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins ="http://localhost:4200")

public class Controlador {

	@Autowired
	private Repositorio repos;

	@GetMapping("/Perfiles")
	public List<Perfiles> listarTodoslosperfiles() {
		return repos.findAll();
	}

}
