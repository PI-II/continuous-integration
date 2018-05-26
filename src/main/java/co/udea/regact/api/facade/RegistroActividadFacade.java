package co.udea.regact.api.facade;

import org.springframework.beans.factory.annotation.Autowired;

import co.udea.regact.api.adapter.ReporteActividadAdapter;
import co.udea.regact.api.dto.ReporteActividadDto;
import co.udea.regact.api.service.RegistroActividadService;

public class RegistroActividadFacade {
	
	@Autowired
	private RegistroActividadService regActService;
	
	
	
	public void registrarActividad(ReporteActividadDto registroActividad) {
		

		ReporteActividadAdapter adapter = new ReporteActividadAdapter(registroActividad);
		
		regActService.registrarActividad(adapter.getEntity());
		
		
	}
	
	

}
