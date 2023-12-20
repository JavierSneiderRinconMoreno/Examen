package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Entrenador;
import com.example.demo.repository.EntrenadorRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/usuarios")
public class ControllerEntrenador {
	
	
	@Autowired
	EntrenadorRepository entrenadorRrepository;
	
	
	@PostMapping("/{id}")
	public Entrenador pstEntrenadorbyId(@PathVariable Integer id, @RequestBody Entrenador usuario) {
		
		Optional<Entrenador> entrenador = entrenadorRrepository.findById(id);
		
		if (entrenador.isPresent()) {
					
			Entrenador re = entrenador.get();
			return re;
		}
		
		return null;

	}
	

}
