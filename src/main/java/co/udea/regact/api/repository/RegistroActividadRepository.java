package co.udea.regact.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.domain.ReporteActividadPK;

public interface RegistroActividadRepository extends CrudRepository<ReporteActividad, ReporteActividadPK> {
	
	
	@SuppressWarnings("unchecked")
	public ReporteActividad save(ReporteActividad reporte);
	
	@EntityGraph(value="findDocenteReport", type = EntityGraphType.LOAD)
	public List<ReporteActividad> getByDocenteDoceIdAndSemestreEstadoEstNombre(Integer idDocente, String estado);

	@EntityGraph(value="findDocenteReport", type = EntityGraphType.LOAD)
	public List<ReporteActividad> getByGrupoGruIdAndSemestreEstadoEstNombre(Integer idGrupo, String estado);

}
