package co.udea.regact.api.service;

import java.util.Optional;

import co.udea.regact.api.domain.GrupoDocenteAsociacion;

public interface GrupoDocenteService {
	
	public Optional<GrupoDocenteAsociacion> getGruposByDocente(Integer idDocente);

}
