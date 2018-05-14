package co.udea.regact.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regact.api.domain.Grupo;
import co.udea.regact.api.service.GrupoService;
import co.udea.regact.api.util.Messages;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

	private static Logger log = LoggerFactory.getLogger(GrupoController.class);

	@Autowired
    private Messages messages;	
	
	@Autowired
	@Qualifier("GrupoServiceImpl")
	private GrupoService grupoService;
	

}
