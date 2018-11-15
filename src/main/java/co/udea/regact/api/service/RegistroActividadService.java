package co.udea.regact.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.repository.RegistroActividadRepository;
import co.udea.regact.api.util.Constants;

@Service
@Qualifier("RegistroActividadService")
public class RegistroActividadService {
	
	@Autowired
	private RegistroActividadRepository regActRepository;
	
	
	public void registrarActividad(ReporteActividad reporteActividad) {
		
		regActRepository.save(reporteActividad);
		
	}
	
	public List<ReporteActividad> getAllByDocenteSemestreActivo(Integer idDocente){
		return regActRepository.getByDocenteDoceIdAndSemestreEstadoEstNombre(idDocente, Constants.ESTADO_ACTIVO.getValue());
	}

	public List<ReporteActividad> getAllByGrupoSemestreActivo(Integer idGrupo) {
		// TODO Auto-generated method stub
		return regActRepository.getByGrupoGruIdAndSemestreEstadoEstNombre(idGrupo, Constants.ESTADO_ACTIVO.getValue());
	}
	

}
