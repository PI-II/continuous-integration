package co.udea.regact.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regact.api.domain.GrupoDocenteAsociacion;


public interface GrupoDocenteRepository extends JpaRepository<GrupoDocenteAsociacion, Integer>{
	
	public List<GrupoDocenteAsociacion> getGruposByIdDocente(Integer idDocente);

}
