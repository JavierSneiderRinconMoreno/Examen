package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data@AllArgsConstructor@RequiredArgsConstructor
public class Tipo_Pokemon {


	@Id
	@SequenceGenerator(name = "id_pueblo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_pueblo")
	private Integer id;
	private String nombre;
	private String Descripcion;

	
}
