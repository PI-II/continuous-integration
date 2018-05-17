package co.udea.regact.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.exception.DataNotFoundException;
import co.udea.regact.api.repository.UsuarioRepository;
import co.udea.regact.api.service.UsuarioService;
import co.udea.regact.api.util.Messages;

@Service
@Qualifier("UsuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private Messages messages;

	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> getUsuarioId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuarioByEmailEstado(String mail, String estado) throws DataNotFoundException{
		// TODO Auto-generated method stub
		Optional<Usuario> usuario = repository.findByUsuEmailAndEstadoEstNombreEquals(mail, estado);
		
		if(!usuario.isPresent()) {
			throw new DataNotFoundException(messages.get("exception.data_not_found.usuario"));
		}else {
			return usuario.get();
		}
		
	}

}
