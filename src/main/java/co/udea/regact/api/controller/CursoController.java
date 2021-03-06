package co.udea.regact.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.dto.CursoDto;
import co.udea.regact.api.facade.CursoFacade;
import co.udea.regact.api.util.Messages;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	private static Logger log = LoggerFactory.getLogger(CursoController.class);
	
	@Autowired
    private Messages messages;

	@Autowired
	private CursoFacade cursoFacade;
	
	
	@GetMapping("getAll")
	public List<CursoDto> getCursos(){
		log.debug("Getting cursos");
		return cursoFacade.getAllCursos();
	}
	@PostMapping("addCurso")
	public void addCurso(CursoDto curso) {
		cursoFacade.setCurso(curso);
	}


//	@GetMapping("/consultarCursosActivosPorDocente")
//	public List<Curso> getCursosPorUsuario(String userId) throws DataNotFoundException{
//		log.debug("Entro a consultar curso del usuario: "+ userId);
//		Optional<Usuario> usuario = usuarioService.getUsuarioId(userId);
//		if(!usuario.isPresent()) {
//			throw new DataNotFoundException(messages.get("exception.data_not_found.usuario"));
//		}
//		
//		usuario.get().getPersona().getDocente()
//		//Predicado que pregunta por los cursos no activos
//		Predicate<Curso> cursoP = p -> p.getEstado() == false;
////		Set<Curso> cursos = usuario.get().getCursos();
//		
////		// Elimina todos los cursos no son activos 
////		cursos.removeIf(cursoP);
////		
////		List<Curso> cursosActivos = new ArrayList<Curso>(cursos);
//		
//		return null;
//	}
	
//	@GetMapping("/consultarCursosActivosPorIdUsu")
//	public List<Curso> getCursosPorUsuario(Integer id) throws DataNotFoundException{
//		log.debug("Entro a consultar curso del usuario: "+ id);
//		Optional<Usuario> usuario = usuarioService.getUsuarioId(id);
//		if(!usuario.isPresent()) {
//			throw new DataNotFoundException(messages.get("exception.data_not_found.usuario"));
//		}
//		
//		//Predicado que pregunta por los cursos no activos
//		Predicate<Curso> cursoP = p -> p.getEstado() == false;
////		Set<Curso> cursos = usuario.get().getCursos();
//		
//		// Elimina todos los cursos que no son activos 
////		cursos.removeIf(cursoP);
//		
////		List<Curso> cursosActivos = new ArrayList<Curso>(cursos);
//		
//		return null;
//	}
	
	
	
}
