package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	
	@Autowired
	PokemonRepository pokemonRepository;
	
	
	@GetMapping("/{tipo}")
	public List<Pokemon> getUsuariosbyId(@PathVariable Integer tipo) {
		
		List<Pokemon> pokemis_tipo = pokemonRepository.findByTipo_pokemon(tipo);
		
		return pokemis_tipo;

	}
	
	@PostMapping
	public Pokemon postPokemon(@RequestBody Pokemon pokemon) {		
		pokemonRepository.save(pokemon);		
		return pokemonRepository.findByNombre(pokemon.getNombre());	

	}
}
