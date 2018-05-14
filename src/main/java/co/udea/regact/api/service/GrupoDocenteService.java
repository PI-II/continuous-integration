package co.udea.regact.api.service;

import java.util.List;

import co.udea.regact.api.domain.GrupoDocenteAsociacion;

public interface GrupoDocenteService {
	
	public List<GrupoDocenteAsociacion> getGruposByDocente(Integer idDocente);

}
