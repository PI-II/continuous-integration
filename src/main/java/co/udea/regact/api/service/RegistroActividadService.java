package co.udea.regact.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.repository.RegistroActividadRepository;

@Service
@Qualifier("RegistroActividadService")
public class RegistroActividadService {
	
	@Autowired
	private RegistroActividadRepository regActRepository;
	
	
	public void registrarActividad(ReporteActividad reporteActividad) {
		
		regActRepository.save(reporteActividad);
		
	}
	

}
