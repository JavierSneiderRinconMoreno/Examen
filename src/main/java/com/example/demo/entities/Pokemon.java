package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Data@AllArgsConstructor@RequiredArgsConstructor
public class Pokemon {

	@Id
	@SequenceGenerator(name = "id_poke", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_poke")
	private Integer id;
	private String nombre;
	private String descripcion;	
	private Integer tipo_pokemon;	
	private Date fecha_descubrimineto;
	private Integer generacion;	
	private String uuid;
	
	/**
	 * relacion de muchos a muchos con entrenadores 
	 */	
	@ManyToMany	(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
			name="captura",
			joinColumns = @JoinColumn(
					name = "pokemon_id" , referencedColumnName = "id"), 
					inverseJoinColumns = @JoinColumn (
							name = "entrenado_idr",
							referencedColumnName = "id"
							
							)					
					)
	private List<Entrenador> entrenadores;
	
	
	/**
	 * relacion de manytoOne con pueblo
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo")
	private Tipo_Pokemon  tipoPokemon;
}