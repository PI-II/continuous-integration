package co.udea.regact.api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Integer> {

	public Optional<Estado> findByEstNombreAndAgenteAteName(String estado, String agente);
	
}
