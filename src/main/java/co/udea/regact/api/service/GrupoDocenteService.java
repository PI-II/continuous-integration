package co.udea.regact.api.service;

import java.util.List;

import co.udea.regact.api.domain.Grupoxdocente;

public interface GrupoDocenteService {
	
	public List<Grupoxdocente> getGruposActivosByDocenteId(Integer idDocente);
	public List<Grupoxdocente> getGruposByDocenteIdAndEstado(Integer idDocente, String estado);

}
