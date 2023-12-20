package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;


@Entity
@Data
public class Pueblo {


	
	private String nombre;
	private String uuid;
	
}
