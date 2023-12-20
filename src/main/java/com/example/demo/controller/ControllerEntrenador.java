package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Entrenador;
import com.example.demo.entities.Pokemon;
//import com.example.demo.entities.Pokemon;
import com.example.demo.repository.EntrenadorRepository;
import com.example.demo.repository.PokemonRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/entrenador")
public class ControllerEntrenador {
	

	@Autowired
	PokemonRepository pokemonRepository;
	@Autowired
	EntrenadorRepository entrenadorRrepository;
	
	@GetMapping("/{uuid}/pokemons")
	public List<Pokemon> getPokemosbyUuid(@PathVariable String  uuid) {
		
		List<Pokemon> p = entrenadorRrepository.findByUuid(uuid).getPokemones();
		
		return p;
	}
	
	
	@PostMapping("/login")
	public String EncontrarUiid(@PathVariable String email ) {
		
		Entrenador e = entrenadorRrepository.findByUuid(email);
				
		return e.getUuid();

	}
	
	@PostMapping("/entrenador/{uuid1}/pokemo/{uuid2}")
	public String pstEntrenadorbyId(@PathVariable String uuid1, @PathVariable String uuid2 ) {
		
		Entrenador agregar = entrenadorRrepository.findByUuid(uuid1);
		Pokemon nuevoPokemon = pokemonRepository.findByUuid(uuid2);
		
		if(agregar.getPokemones().contains(nuevoPokemon)) {
			return "error: true, message:pokemon ya esta registrado al entrenador" ;
		}else {
			agregar.getPokemones().add(nuevoPokemon);
			return agregar.getPokemones().toString();
		}
		

	}
	
	
	
	

}
