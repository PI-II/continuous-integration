package co.udea.regact.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.GrupoDocenteDTO;
import co.udea.regact.api.facade.GrupoDocenteFacade;
import co.udea.regact.api.service.GrupoDocenteService;

@RestController
@RequestMapping("/grupodocente")
public class GrupoDocenteController {
	
	private static Logger log = LoggerFactory.getLogger(GrupoDocenteController.class);
	
	@Autowired
	private GrupoDocenteFacade docenteFacade;
	
	@RequestMapping(value="activos", method=RequestMethod.GET)
	public List<GrupoDocenteDTO> getGruposActivosDocente(Integer idDocente){
		log.debug("Obteniendo los grupos activos del docente ======");
		List<GrupoDocenteDTO> grupos = docenteFacade.getGruposActivosByDocenteId(idDocente);
		
		return grupos;
		
	}
	

}
