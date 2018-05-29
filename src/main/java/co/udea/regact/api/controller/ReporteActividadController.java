package co.udea.regact.api.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.tomcat.jni.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.ReporteActividadDto;
import co.udea.regact.api.facade.RegistroActividadFacade;

@RestController
@RequestMapping("/reporte")
public class ReporteActividadController {

	private static Logger log = LoggerFactory.getLogger(ReporteActividadController.class);

	@Autowired
	private RegistroActividadFacade registroActividadFacade;

	@PostMapping(value = "registrar")
	public void registrarReporteActividad(@RequestBody ReporteActividadDto registroActividad) {

		registroActividadFacade.registrarActividad(registroActividad);
	}

	@GetMapping("consultarsemestreactivo")
	public Set<ReporteActividadDto> getReporteActividadesByDocenteSemestreActivo(int idDocente) {
		Set<ReporteActividadDto> regs = new HashSet<>();

		ReporteActividadDto dto = new ReporteActividadDto();
		dto.setFechaReporte(new Date());
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
		dto = new ReporteActividadDto();

		dto.setFechaReporte(new Date());
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
