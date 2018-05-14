package co.udea.regact.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.udea.regact.api.domain.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Integer>{


	public List<Grupo> findByIdEstado(Integer idEstado); 
}
