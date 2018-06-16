package co.udea.regact.api.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.udea.regact.api.adapter.UsuarioAdapter;
import co.udea.regact.api.dto.UsuarioDto;
import co.udea.regact.api.service.UsuarioService;

@Service
public class UsuarioFacade {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	public UsuarioDto getUsuarioLogin(String email, String password) {
		
		return new UsuarioAdapter(usuarioService.getUsuarioLogin(email, password))
				.getDto();
		
	}
	
	

}
