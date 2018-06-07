package co.udea.regact.api.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.ReporteActividadAdapter;
import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.dto.ReporteActividadDto;
import co.udea.regact.api.service.RegistroActividadService;

@Service
public class ReporteActividadFacade {
	
	@Autowired
	private RegistroActividadService regActService;
	
	
	
	public void registrarActividad(ReporteActividadDto registroActividad) {
		

		ReporteActividadAdapter adapter = new ReporteActividadAdapter(registroActividad);
		
		regActService.registrarActividad(adapter.getEntity());
		
		
	}
	
	public List<ReporteActividadDto> getAllByDocenteSemestreActivo(Integer idDocente){
		
		List<ReporteActividadDto> response = new ArrayList<>();
		List<ReporteActividad> consulta = regActService.getAllByDocenteSemestreActivo(idDocente);
		
		consulta.stream().forEach(r -> {
			response.add(new ReporteActividadAdapter(r).getDto());	
		});
		
		return response;
		
	}
	
	public List<ReporteActividadDto> getAllByGrupoSemestreActivo(Integer idGrupo){
		
		List<ReporteActividadDto> response = new ArrayList<>();
		List<ReporteActividad> consulta = regActService.getAllByGrupoSemestreActivo(idGrupo);
		
		consulta.stream().forEach(r -> {
			response.add(new ReporteActividadAdapter(r).getDto());	
		});
		
		return response;
		
	}

}
