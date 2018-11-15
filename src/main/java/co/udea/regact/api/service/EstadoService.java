package co.udea.regact.api.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Estado;
import co.udea.regact.api.repository.EstadoRepository;

@Service
public class EstadoService {
	
	private EstadoRepository estadoRepository;
	
	public Optional<Estado> getEstadoByNameAgente(String estado, String agente) {
		return estadoRepository.findByEstNombreAndAgenteAteName(estado, agente);
	}
	

}
