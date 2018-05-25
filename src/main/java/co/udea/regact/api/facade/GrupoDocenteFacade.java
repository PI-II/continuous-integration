package co.udea.regact.api.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.GrupoDocenteAdapterImpl;
import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.dto.GrupoDocenteDTO;
import co.udea.regact.api.service.GrupoDocenteService;

@Service
@Qualifier("GrupoDocenteFacade")
public class GrupoDocenteFacade {

	@Autowired
	private GrupoDocenteService service;

	public List<GrupoDocenteDTO> getGruposActivosByDocenteId(Integer idDocente) {
		
		List<GrupoDocenteDTO> grupos = new ArrayList<>();
		List<Grupoxdocente> gruposEntities = service.getGruposActivosByDocenteId(idDocente);

		gruposEntities.stream().forEach(e -> {
			grupos.add(new GrupoDocenteAdapterImpl(e).getGrupoDocenteDTO());
		});
		return grupos;
	}
	
	
	
	
	
	
	
	
	
}
