package com.example.demo.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Entity
@Data
public class Pokemon {


	
	private String nombre;
	private String descripcion;	
	
	@Id
	@SequenceGenerator(name = "tipo_pokemon", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "tipo_pokemon")
	private Integer tipo_pokemon;	
	private Date fecha_descubrimineto;
	private Integer generacion;
	
	private String uuid;
}