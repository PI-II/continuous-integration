package co.udea.regact.api.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.CursoAdapter;
import co.udea.regact.api.dto.CursoDto;
import co.udea.regact.api.service.CursoService;
import co.udea.regact.api.service.EstadoService;

@Service
@Qualifier("CursoFacade")
public class CursoFacade {
	
	
	@Autowired
	private CursoService cursoService;

	public List<CursoDto> getAllCursos() {
		
		List<CursoDto> dtos = new ArrayList<CursoDto>();
		
		cursoService.getAll().forEach(f -> {
			dtos.add(new CursoAdapter(f).getDto());
		});
		
		return dtos;
		
	}
	
	public void setCurso(CursoDto dto) {
		
		cursoService.addOne(new CursoAdapter(dto).getEntity());
	}
	
	

}
