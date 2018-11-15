package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.Curso;
import co.udea.regact.api.dto.CursoDto;
import co.udea.regact.api.exception.AdapterException;

public class CursoAdapter implements GenericAdapter<CursoDto, Curso> {
	
	private Curso entity;
	private CursoDto dto;
	
	public CursoAdapter(Curso entity) {
		this.entity = entity;
	}
	
	public CursoAdapter(CursoDto dto) {
		this.dto = dto;
	}


	@Override
	public CursoDto getDto() throws AdapterException {
		
		if (entity == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		dto = new CursoDto();
		dto.setId(entity.getCurId());
		dto.setEstado(entity.getEstado().getEstNombre());
		dto.setHorasPracticas(entity.getCurHpracticas());
		dto.setHorasTeoricas(entity.getCurHteoricas());
		dto.setHorasTotales(entity.getCurHpracticas() + entity.getCurHteoricas());
		dto.setIdEstado(entity.getEstado().getEstId());
		dto.setNombre(entity.getCurNombre());
		
		return dto;
	}

	@Override
	public Curso getEntity() throws AdapterException {
		
		if (dto == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		entity = new Curso();
		
		entity.setCurHpracticas(dto.getHorasPracticas());
		entity.setCurHteoricas(dto.getHorasTeoricas());
		entity.setCurNombre(dto.getNombre());
		entity.setIdEstado(dto.getIdEstado());
		
		return entity;
	}

}
