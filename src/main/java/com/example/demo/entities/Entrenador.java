package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data@AllArgsConstructor@RequiredArgsConstructor
public class Entrenador {

	@Id
	@SequenceGenerator(name = "id_entrena", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_entrena")
	private Integer id;
	
	private String nombre;
	private String apellido;
	private Date fecha_Nacimiento;
	private Date fecha_vinculacion;
	private Integer pueblo_Id;	
	private String uuid;
	
	@ManyToMany(mappedBy = "entrenadores")
	private List<Pokemon> pokemones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pueblo")
	private Pueblo pueblo;
}
