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
public class Pueblo {


	@Id
	@SequenceGenerator(name = "id_pueblo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_pueblo")
	private Integer id;
	private String nombre;
	private String uuid;
	
}
