package co.udea.regact.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regact.api.domain.GrupoDocenteAsociacion;


public interface GrupoDocenteRepository extends JpaRepository<GrupoDocenteAsociacion, Integer>{
	
	public Optional<GrupoDocenteAsociacion> getGruposByIdDocente(Integer idDocente);

}
