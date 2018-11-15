package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.dto.GrupoDocenteDTO;

public abstract class IGrupoDocenteAdapter {
	
	Grupoxdocente entidad;
	GrupoDocenteDTO dto;

	public abstract Grupoxdocente getGrupoDocente();
	
	public abstract GrupoDocenteDTO getGrupoDocenteDTO();

}
