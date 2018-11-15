package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.dto.UsuarioDto;
import co.udea.regact.api.exception.AdapterException;

public class UsuarioAdapter implements GenericAdapter<UsuarioDto, Usuario> {

	private UsuarioDto dto;
	private Usuario entity;
	
	public UsuarioAdapter(UsuarioDto dto) {
		this.dto = dto;
	}
	
	public UsuarioAdapter(Usuario entity) {
		this.entity = entity;
	}
	
	@Override
	public UsuarioDto getDto() throws AdapterException {
		
		if (entity == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		dto = new UsuarioDto();
		dto.setEmail(entity.getUsuEmail());
		dto.setId(entity.getUsuId());
		dto.setIdEstado(entity.getEstado().getEstId());
		dto.setIdPerfil(entity.getPerfile().getPilId());
		dto.setNombreEstado(entity.getEstado().getEstNombre());
		dto.setNombrePerfil(entity.getPerfile().getPilNombre());
		dto.setNombrePersona(entity.getPersona().getPerNombre());
		dto.setPassword(entity.getUsuPassword());
		
		return dto;
	}

	@Override
	public Usuario getEntity() throws AdapterException {
		
		if (dto == null) {
			throw new AdapterException("exception.adapter.message");
		}
		
		return null;
	}

}
