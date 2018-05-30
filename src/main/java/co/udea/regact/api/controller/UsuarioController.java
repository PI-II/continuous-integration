package co.udea.regact.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private static Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService service;

	@RequestMapping(value="consultarPorMailEstado", method= RequestMethod.GET)
	public Usuario getUsuarioByMailEstado(String mail, String estado) {
		
		log.debug("Getting user info by mail: " + mail);
		mail = mail.toUpperCase();
		Usuario result = service.getUsuarioByEmailEstado(mail, estado);
		
		return result;
		
	}
}
