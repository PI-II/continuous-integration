package co.udea.regact.api.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Actividad;
import co.udea.regact.api.repository.ActividadRepository;

@Service
@Qualifier("ActividadService")
public class ActividadService {
	
	
	@Autowired
	private ActividadRepository repository;
	
	public Set<Actividad> getAllActividades(){
		
		return repository.findAll();
		
	}
}
