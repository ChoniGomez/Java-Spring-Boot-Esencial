package es.dsrroma.school.spingboot.reuniones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.dsrroma.school.spingboot.reuniones.data.ReunionRepository;
import es.dsrroma.school.spingboot.reuniones.models.Reunion;


@Service
public class ReunionService {

	private final ReunionRepository reunionRepository;

	public ReunionService(ReunionRepository reunionRepository) {
		this.reunionRepository = reunionRepository;
	}

	public List<Reunion> getAllReuniones() {
		return reunionRepository.findAll();
	}
	
	public Optional<Reunion> getById(long id) {
		return reunionRepository.findById(id);
	}
}
