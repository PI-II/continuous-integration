package co.udea.regact.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.RegistroActividadDTO;

@RestController
@RequestMapping("/registroactividad")
public class RegistroActividadController {
	
	private static Logger log = LoggerFactory.getLogger(RegistroActividadController.class);
	
	@PostMapping(value = "registrar", consumes = "application/json")
	ResponseEntity<?> registrarActividad(@RequestBody RegistroActividadDTO registro) {
		
		
		
		return ResponseEntity.noContent().build();
	}
	

}
