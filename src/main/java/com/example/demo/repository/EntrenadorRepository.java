package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Entrenador;
public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> { 	
	public  Entrenador findByUuid(String uuid);

}
