package es.dsrroma.school.spingboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.dsrroma.school.spingboot.reuniones.models.Reunion;

@RepositoryRestResource(path = "reuniones")
public interface ReunionRepository extends JpaRepository<Reunion, Long> {

}