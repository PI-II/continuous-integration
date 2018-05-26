package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.ReporteActividad;
import co.udea.regact.api.dto.ReporteActividadDto;

public class ReporteActividadAdapter implements GenericAdapter<ReporteActividadDto, ReporteActividad> {

	private ReporteActividadDto dto;
	private ReporteActividad entity;

	public ReporteActividadAdapter(ReporteActividad entity) {
		super();
		this.entity = entity;
	}

	@Override
	public ReporteActividadDto getDto() {

		return dto;
	}

	public ReporteActividadAdapter(ReporteActividadDto dto) {
		super();
		this.dto = dto;
	}

	@Override
	public ReporteActividad getEntity() {

		
		
		return entity;
	}

}
