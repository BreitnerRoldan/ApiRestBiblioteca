package com.pruebaSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaSpring.entity.Persona;
import com.pruebaSpring.model.PersonaModel;
import com.pruebaSpring.service.PersonaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping("")
	public ResponseEntity<List<PersonaModel>> findAllPersonas() throws Exception {
		try

		{
			List<Persona> person = personaService.findAll();
			List<PersonaModel> pers = new ArrayList<PersonaModel>();

			for (Persona p : person) {
				pers.add(new PersonaModel(p.getId(), p.getNombre(), p.getApellido(), p.getDni()));
			}
			return new ResponseEntity<List<PersonaModel>>(pers, HttpStatus.OK);

		} catch (Exception e)

		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Persona>> finByIdPersonas(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok(personaService.findById(id));

	}

	@PostMapping("")
	public ResponseEntity<PersonaModel> SavePersonas(@RequestBody PersonaModel model) throws Exception {
		Persona perGua = new Persona();

		perGua.setNombre(model.getNombre());
		perGua.setApellido(model.getApellido());
		perGua.setDni(model.getDni());

		perGua = personaService.save(perGua);

		return new ResponseEntity<PersonaModel>(
				new PersonaModel(perGua.getId(), perGua.getNombre(), perGua.getApellido(), perGua.getDni()),
				HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updatePersonas(@PathVariable(name = "id") Long id, @RequestBody PersonaModel model)
			throws Exception {
		try {
			Persona p = new Persona();
			p.setNombre(model.getNombre());
			p.setApellido(model.getApellido());
			p.setDni(model.getDni());

			p = personaService.update(id, p);

			return new ResponseEntity<PersonaModel>(
					new PersonaModel(p.getId(), p.getNombre(), p.getApellido(), p.getDni()), HttpStatus.ACCEPTED);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error. por favor Intente de nuevo.\"}");
		}
	}

	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable Long id) throws Exception {
		return personaService.delete(id);
	}
}
