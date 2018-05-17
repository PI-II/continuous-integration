package co.udea.regact.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.GrupoDocenteAdapterImpl;
import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.dto.GrupoDocenteDTO;
import co.udea.regact.api.repository.GrupoDocenteRepository;
import co.udea.regact.api.service.GrupoDocenteService;

@Service
@Qualifier("GrupoDocenteServiceImpl")
public class GrupoDocenteServiceImpl implements GrupoDocenteService {
	
	@Autowired
	private GrupoDocenteRepository repository; 

	@Override
	public List<GrupoDocenteDTO> getGruposActivosByDocenteId(Integer idDocente, String estado) {
		
		List<GrupoDocenteDTO> results = new ArrayList<>();
		estado = estado.toUpperCase();
		List<Grupoxdocente> gruposDocente = repository.findByIdIdDocenteAndSemestreEstadoEstNombreEquals(idDocente, estado);
		
		GrupoDocenteAdapterImpl adapter;
		for (Grupoxdocente grupoxdocente : gruposDocente) {
			adapter = new GrupoDocenteAdapterImpl(grupoxdocente);
			results.add(adapter.getGrupoDocenteDTO());
		}
		
		return results;
	}

}
