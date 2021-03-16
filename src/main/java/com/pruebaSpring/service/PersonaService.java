package com.pruebaSpring.service;

import java.util.List;
import java.util.Optional;

import com.pruebaSpring.entity.Persona;

public interface PersonaService {
	
	 List<Persona> findAll() throws Exception;
	 Optional<Persona> findById(Long id); 
	 Persona save(Persona persona)throws Exception; 
	 Persona update(Long id, Persona persona)throws Exception; 
	 boolean delete(Long id) throws Exception; 

}
