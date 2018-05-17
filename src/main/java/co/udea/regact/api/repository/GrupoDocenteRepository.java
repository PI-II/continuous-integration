package co.udea.regact.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.domain.GrupoxdocentePK;

public interface GrupoDocenteRepository extends CrudRepository<Grupoxdocente, GrupoxdocentePK>{
	
	public List<Grupoxdocente> findByIdIdDocenteAndSemestreEstadoEstNombreEquals(Integer idDocente, String estado);

}
