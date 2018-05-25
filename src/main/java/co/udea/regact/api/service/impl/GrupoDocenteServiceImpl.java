package co.udea.regact.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.repository.GrupoDocenteRepository;
import co.udea.regact.api.service.GrupoDocenteService;
import co.udea.regact.api.util.Constants;

@Service
@Qualifier("GrupoDocenteServiceImpl")
public class GrupoDocenteServiceImpl implements GrupoDocenteService {
	
	@Autowired
	private GrupoDocenteRepository repository; 

	@Override
	public List<Grupoxdocente> getGruposActivosByDocenteId(Integer idDocente) {

		List<Grupoxdocente> gruposDocente = repository
				.findByIdIdDocenteAndSemestreEstadoEstNombreEquals(idDocente, Constants.ESTADO_ACTIVO.getValue());
		
		return gruposDocente;
	}

	@Override
	public List<Grupoxdocente> getGruposByDocenteIdAndEstado(Integer idDocente, String estado) {

		estado = estado.toUpperCase();
		List<Grupoxdocente> gruposDocente = repository.findByIdIdDocenteAndSemestreEstadoEstNombreEquals(idDocente, estado);
		
		return gruposDocente;
	}

}
