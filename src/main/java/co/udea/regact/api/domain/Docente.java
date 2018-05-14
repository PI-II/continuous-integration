package co.udea.regact.api.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doce_id")
	private int id;
	
	@Column(name="doce_departamento")
	private String departamento;
	
	@Column(name="doce_titulo")
	private String titulo;
	
	@Column(name="doce_experiencia")
	private int experiencia;
	
	@Column(name="per_id")
	private int idPersona;
	
	@OneToOne
	@JoinColumn(name = "per_id", referencedColumnName = "per_id",
				nullable = false, insertable = false, updatable = false)
	private Persona persona;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docente")
	private List<GrupoDocenteAsociacion> gruposDocentes;
	
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}
	

	public Docente(int id, String departamento, String titulo, int experiencia, int idPersona) {
		super();
		this.id = id;
		this.departamento = departamento;
		this.titulo = titulo;
		this.experiencia = experiencia;
		this.idPersona = idPersona;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
}
