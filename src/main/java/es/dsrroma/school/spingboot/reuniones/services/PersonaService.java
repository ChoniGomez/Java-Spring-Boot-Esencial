package es.dsrroma.school.spingboot.reuniones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.dsrroma.school.spingboot.reuniones.data.PersonaRepository;
import es.dsrroma.school.spingboot.reuniones.models.Persona;

@Service
public class PersonaService {

	private final PersonaRepository personaRepository;
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	public List<Persona> getAllPersonas() {
		return personaRepository.findAll();
	}

	public Optional<Persona> getById(long id) {
		return personaRepository.findById(id);
	}
}
