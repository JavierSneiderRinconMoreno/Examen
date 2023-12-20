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
}