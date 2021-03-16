package com.pruebaSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaSpring.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long >  {

}
