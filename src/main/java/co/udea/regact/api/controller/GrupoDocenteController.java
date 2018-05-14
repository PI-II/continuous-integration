package co.udea.regact.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.domain.Grupo;
import co.udea.regact.api.domain.GrupoDocenteAsociacion;
import co.udea.regact.api.exception.DataNotFoundException;
import co.udea.regact.api.service.GrupoDocenteService;
import co.udea.regact.api.util.Messages;

@RestController
@RequestMapping("/gruposdocente")
public class GrupoDocenteController {
	
	
	private static Logger log = LoggerFactory.getLogger(CursoController.class);

	@Autowired
    private Messages messages;	
	
	@Autowired
	private GrupoDocenteService grupoDocenteService;
	

	@RequestMapping(value = "activos", method = RequestMethod.GET)
	public List<Grupo> getGruposActivos(int idDocente) throws DataNotFoundException{
		log.debug("Entro a consultar");
		
		List<GrupoDocenteAsociacion> grupos = grupoDocenteService.getGruposByDocente(idDocente);
		//Predicate<T>
		List<Grupo> gruposL = null;
			
		return gruposL;
	}

}
