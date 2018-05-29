package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.dto.ReporteActividadDto;
import co.udea.regact.api.exception.AdapterException;

public class ReporteActividadAdapter implements GenericAdapter<ReporteActividadDto, ReporteActividad> {

	private ReporteActividadDto dto;
	private ReporteActividad entity;

	public ReporteActividadAdapter(ReporteActividad entity) {
		super();
		this.entity = entity;
	}

	@Override
	public ReporteActividadDto getDto() {

		if (entity == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		dto = new ReporteActividadDto();
		dto.setFechaReporte(entity.getRepFecha());
		dto.setHoras(entity.getRepHoras());
		dto.setIdActividad(entity.getActividade().getActId());
		dto.setIdDocente(entity.getDocente().getDoceId());
		dto.setIdGrupo(entity.getGrupo().getGruId());
		dto.setIdSemestre(entity.getSemestre().getSemId());
		dto.setNombreActividad(entity.getActividade().getActNombre());
		dto.setNombreGrupo(entity.getGrupo().getGruNombre());
		dto.setObservaciones(entity.getRepObservaciones());
		dto.setSemestre(entity.getSemestre().getSemNombre());
		
		return dto;
	}

	public ReporteActividadAdapter(ReporteActividadDto dto) {
		super();
		this.dto = dto;
	}

	@Override
	public ReporteActividad getEntity() {

		if (dto == null) {
			throw new AdapterException("exception.adapter.message");
		}
		return entity;
	}

}
