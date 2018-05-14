package co.udea.regact.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Grupo;
import co.udea.regact.api.domain.GrupoDocenteAsociacion;
import co.udea.regact.api.repository.GrupoDocenteRepository;
import co.udea.regact.api.service.GrupoDocenteService;


@Service
@Qualifier("GrupoDocenteServiceImpl")
public class GrupoDocenteServiceImpl implements GrupoDocenteService {
	
	private GrupoDocenteRepository repository;
	
	public GrupoDocenteServiceImpl(GrupoDocenteRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<GrupoDocenteAsociacion> getGruposByDocente(Integer idDocente) {
		// TODO Auto-generated method stub
		return repository.getGruposByIdDocente(idDocente);
	}

}
