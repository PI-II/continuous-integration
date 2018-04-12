package co.udea.regact.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regact.api.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, String>{
	
	public Optional<Curso> findByCodigo(String codigo); 
}
