package com.pruebaSpring.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSpring.entity.Persona;
import com.pruebaSpring.repository.PersonaRepository;
import com.pruebaSpring.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	@Transactional
	public List<Persona> findAll() throws Exception {

		try {
			List<Persona> personas = personaRepository.findAll();
			return personas;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Optional<Persona> findById(Long id) {
			return personaRepository.findById(id);
		
	}

	@Override
	@Transactional
	public Persona save(Persona persona) throws Exception {

		try {
			persona = personaRepository.save(persona);
			return persona;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Persona update(Long id, Persona persona) throws Exception {

		try {
			Optional<Persona> personas = personaRepository.findById(id);
			Persona person = personas.get();
			persona = personaRepository.save(persona);
			return person;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {

		try {
			if (personaRepository.existsById(id)) {
				personaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
