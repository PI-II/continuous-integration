package co.udea.regact.api.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.GenericDto;
import co.udea.regact.api.facade.ActividadFacade;

@RestController
@RequestMapping("/tipoactividad")
public class TipoActividadController {
	
	@Autowired
	private ActividadFacade facade;
	
	
	@GetMapping("getAll")
	public Set<GenericDto> getAllTipoActividades(){
		return facade.getActividades();
	}

}
