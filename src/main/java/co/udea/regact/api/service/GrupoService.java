package co.udea.regact.api.service;

import java.util.List;

import co.udea.regact.api.domain.Grupo;

public interface GrupoService {
	
	public List<Grupo> getGruposByEstado(Integer idEstado);
	
}
