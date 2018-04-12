package co.udea.regact.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.domain.Curso;
import co.udea.regact.api.exception.DataNotFoundException;
import co.udea.regact.api.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	private static Logger log = LoggerFactory.getLogger(CursoController.class);

	@Autowired
	private CursoService cursoService;

	
	@GetMapping("/obtener")
	public ResponseEntity<Curso> getCurso(String codigo) throws DataNotFoundException{
		log.debug("Entro a consultar curso: "+codigo);
		Curso curso = cursoService.getCurso(codigo);
		return ResponseEntity.ok(curso);
	}
	
	
}
