package co.udea.regact.api.facade;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.ActividadAdapter;
import co.udea.regact.api.domain.Actividad;
import co.udea.regact.api.dto.GenericDto;
import co.udea.regact.api.service.ActividadService;

@Service
@Qualifier("ActividadFacade")
public class ActividadFacade {
	
	@Autowired
	private ActividadService service;
	
	
	public Set<GenericDto> getActividades(){
		
		Set<GenericDto> actividades = new HashSet<GenericDto>();
		Set<Actividad> entityActividades = service.getAllActividades();
		entityActividades.stream().forEach(f -> {
			actividades.add(new ActividadAdapter(f).getDto());
		});
		
		return actividades;
		
	}

}
