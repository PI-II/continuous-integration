package co.udea.regact.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regact.api.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
