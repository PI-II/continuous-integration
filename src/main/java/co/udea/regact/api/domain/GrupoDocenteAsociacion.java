package co.udea.regact.api.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Esta clase es a conveniencia para poder asociar los grupos asociados a un docente
 * por semestres
 * 
 * @author orvie
 *
 */
@Entity
@Table(name = "gruposxdocentes")
@IdClass(GrupoDocenteSemestreID.class)
public class GrupoDocenteAsociacion{

	@Id
	@Column(name = "id_docente")
	private int idDocente;
	
	@Id
	@Column(name = "id_grupo")
	private int idGrupo;
	
	@Id
	@Column(name = "id_semestre")
	private int idSemestre;
	
	@Column(name = "gdte_horas")
	private int horas;
	
	@ManyToOne
	@JoinColumn(name = "id_grupo", referencedColumnName = "gru_id",
				insertable = false, updatable = false, nullable = false)
	private Grupo grupo;
	
	@ManyToOne
	@JoinColumn(name = "id_docente", referencedColumnName = "doce_id",
				insertable = false, updatable = false, nullable = false)
	private Docente docente;
	
	@ManyToOne
	@JoinColumn(name = "id_semestre", referencedColumnName = "sem_id",
				insertable = false, updatable = false, nullable = false)
	private Semestre semestre;
	
	public GrupoDocenteAsociacion() {
		// TODO Auto-generated constructor stub
	}

	public GrupoDocenteAsociacion(int idDocente, int idGrupo, int idSemestre, int horas) {
		super();
		this.idDocente = idDocente;
		this.idGrupo = idGrupo;
		this.idSemestre = idSemestre;
		this.horas = horas;
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	
	
	
	

}
