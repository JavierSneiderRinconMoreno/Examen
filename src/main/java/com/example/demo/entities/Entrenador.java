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
public class Entrenador {

	
	private String nombre;
	private String apellido;
	private Date fecha_Nacimiento;
	private Date fecha_vinculacion;
	
	

	@Id
	@SequenceGenerator(name = "pueblo_Id", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "pueblo_Id")
	private Integer pueblo_Id;
	
	private String uuid;
}
