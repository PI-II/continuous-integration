package co.udea.regact.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	public List<Usuario> findByUsuEmail(String mail);
	
	public List<Usuario> findByUsuId(Integer id);
	
	public Optional<Usuario> findByUsuEmailAndEstadoEstNombreEquals(String mail, String estado);

}
