package co.udea.regact.api.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.tomcat.jni.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.RegistroActividadDto;

@RestController
@RequestMapping("/reporte")
public class RegistroActividadController {
	
	private static Logger log = LoggerFactory.getLogger(RegistroActividadController.class);
	
	@PostMapping(value = "registrar", consumes = "application/json")
	public void registrarActividad(@RequestBody RegistroActividadDto registro) {
		
		
	}
	
	@GetMapping("consultarpordocente")
	public Set<RegistroActividadDto> getRegActividadesByDocenteSemestreActivo(int idDocente){
		Set<RegistroActividadDto> regs = new HashSet<>();
		
		RegistroActividadDto dto = new RegistroActividadDto();
		dto.setFechaReporte(new Date().toString());
		dto.setHoras(5);
		dto.setIdActividad(2);
		dto.setIdDocente(1);
		dto.setIdGrupo(1);
		dto.setIdSemestre(1);
		dto.setNombreActividad("Laboraorio");
		dto.setNombreGrupo("G-001");
		dto.setObservaciones("un mock de prueba");
		dto.setSemestre("2018-1");
		
		
		regs.add(dto);
		dto = new RegistroActividadDto();
		
		dto.setFechaReporte(new Date().toString());
		dto.setHoras(5);
		dto.setIdActividad(2);
		dto.setIdDocente(1);
		dto.setIdGrupo(1);
		dto.setIdSemestre(1);
		dto.setNombreActividad("TALLER");
		dto.setNombreGrupo("G-001");
		dto.setObservaciones("un mock de prueba 222");
		dto.setSemestre("2018-1");
		
		regs.add(dto);
		
		return regs;
		
	}
	

}
