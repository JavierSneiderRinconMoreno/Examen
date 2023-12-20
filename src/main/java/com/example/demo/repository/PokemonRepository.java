package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pokemon;
import com.example.demo.entities.Tipo_Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
	
	public List<Pokemon> findByTipoPokemon(Tipo_Pokemon tipoPokemon);
	public List<Pokemon>  findByTipo_pokemon(Integer tipo_pokemon);
	
	public Pokemon  findByNombre(String nombre);
	
	public Pokemon  findByUuid(String uuid);

}
