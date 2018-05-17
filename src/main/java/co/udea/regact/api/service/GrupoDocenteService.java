package co.udea.regact.api.service;

import java.util.List;

import co.udea.regact.api.dto.GrupoDocenteDTO;

public interface GrupoDocenteService {
	
	public List<GrupoDocenteDTO> getGruposActivosByDocenteId(Integer idDocente, String estado);

}
