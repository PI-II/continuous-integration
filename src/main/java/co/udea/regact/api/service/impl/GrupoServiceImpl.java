package co.udea.regact.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Grupo;
import co.udea.regact.api.repository.GrupoRepository;
import co.udea.regact.api.service.GrupoService;

@Service
@Qualifier("GrupoServiceImpl")
public class GrupoServiceImpl implements GrupoService{
	
	private GrupoRepository grupoRepository;
	
	public GrupoServiceImpl(GrupoRepository grupoRepository) {
		// TODO Auto-generated constructor stub
		this.grupoRepository = grupoRepository;
	}

	@Override
	public List<Grupo> getGruposByEstado(Integer idEstado) {
		// TODO Auto-generated method stub
		return null;
	}




}
