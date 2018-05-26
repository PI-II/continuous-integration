package co.udea.regact.api.repository;

import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.domain.ReporteActividadPK;

public interface RegistroActividadRepository extends CrudRepository<ReporteActividad, ReporteActividadPK> {
	
	
	@SuppressWarnings("unchecked")
	public ReporteActividad save(ReporteActividad reporte);

}
