package co.udea.regact.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.regact.api.domain.Curso;
import co.udea.regact.api.repository.CursoRepository;

@Service
@Qualifier("CursoService")
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public Curso getCurso(Integer id) {
		return cursoRepository.findOne(id);
	}
	
	public List<Curso> getAll(){
		return cursoRepository.findAll();
	}
	
	public void addOne(Curso c) {
		cursoRepository.save(c);
	}
	
	public void deleteOne(Curso c) {
		cursoRepository.delete(c);
	}
}
