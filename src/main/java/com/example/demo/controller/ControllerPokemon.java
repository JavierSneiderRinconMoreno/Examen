package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pokemon;
import com.example.demo.repository.PokemonRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pokemons")
public class ControllerPokemon {

	
	PokemonRepository pokemonRepository;
	
	
	@GetMapping("/{id}")
	public List<Pokemon> getUsuariosbyId(@PathVariable Integer id) {
		
		Optional<Pokemon> pokemon = pokemonRepository.findById(id);
		
		if (pokemon.isPresent()) {
			return null;
		}
		
		return null;

	}
	
	@PostMapping
	public Pokemon postPokemon(@RequestBody Pokemon pokemon) {
		
		pokemonRepository.save(pokemon);
		
		return pokemon;
		

	}
}
