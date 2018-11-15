package co.udea.regact.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.dto.UsuarioDto;
import co.udea.regact.api.facade.UsuarioFacade;
import co.udea.regact.api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private static Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioFacade usuarioFacade;

	@RequestMapping(value="login", method= RequestMethod.POST)
	public UsuarioDto getUsuarioByMailEstado(String email, String password) {
		
		log.debug("Getting user info by mail: " + email);
		email = email.toUpperCase();
		
		return usuarioFacade.getUsuarioLogin(email, password);
		
	}
}
