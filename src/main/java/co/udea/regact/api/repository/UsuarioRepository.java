package co.udea.regact.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import co.udea.regact.api.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	public List<Usuario> findByUsuEmail(String mail);
	
	public List<Usuario> findByUsuId(Integer id);
	
	public Optional<Usuario> findByUsuEmailAndEstadoEstNombreEquals(String mail, String estado);
	
	@EntityGraph(value="usuarios.consulta.login", type=EntityGraphType.LOAD)
	public Optional<Usuario> findByUsuEmailAndUsuPasswordEquals(String email, String password);

}
