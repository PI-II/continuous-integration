package co.udea.regact.api.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.Actividad;

public interface ActividadRepository extends CrudRepository<Actividad, Integer> {
	
	public Set<Actividad> findAll();

}
