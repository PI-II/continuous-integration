package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.Actividad;
import co.udea.regact.api.dto.GenericDto;
import co.udea.regact.api.exception.AdapterException;

public class ActividadAdapter implements GenericAdapter<GenericDto, Actividad> {
	
	private GenericDto dto;
	private Actividad entity;
	
	public ActividadAdapter(GenericDto dto) {
		this.dto = dto;
	}
	
	public ActividadAdapter(Actividad entity) {
		
		this.entity = entity;
	}

	@Override
	public GenericDto getDto() throws AdapterException{
		
		if (entity == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		dto = new GenericDto();
		dto.setId(entity.getActId());
		dto.setNombre(entity.getActNombre());
		dto.setDescripcion(entity.getActDescripcion());
		
		return dto;
	}

	@Override
	public Actividad getEntity() throws AdapterException{
		// TODO Auto-generated method stub
		return entity;
	}

}
