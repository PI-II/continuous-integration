package co.udea.regact.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.udea.regact.api.domain.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Integer>{

	@Query("select gru_id,cur_id,gru_fechafin,gru_fechainicio,est_id,gru_nombre,gru_cant_estudiantes,gru_diasclase,gru_horafinal,gru_horainicial from docentes\n" + 
			"inner join personas on docentes.per_id = personas.per_id\n" + 
			"inner join gruposxdocentes on gruposxdocentes.id_docente = docentes.doce_id\n" + 
			"inner join grupos on gruposxdocentes.id_grupo = grupos.gru_id\n" + 
			"inner join cursos on grupos.cur_id = cursos.cur_id\n" + 
			"where docentes.doce_id = ?1")
	public List<Grupo> findByDocente(Integer idDocente); 
}
