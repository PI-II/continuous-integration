package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the docentes database table.
 * 
 */
@Entity
@Table(name="docentes")
@NamedQuery(name="Docente.findAll", query="SELECT d FROM Docente d")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="doce_id")
	private Integer doceId;

	@Column(name="doce_departamento")
	private String doceDepartamento;

	@Column(name="doce_experiencia")
	private Integer doceExperiencia;

	@Column(name="doce_titulo")
	private String doceTitulo;

	//bi-directional many-to-one association to Persona
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="per_id")
	private Persona persona;

	//bi-directional many-to-one association to Grupoxdocente
	@OneToMany(mappedBy="docente")
	@JsonManagedReference
	private List<Grupoxdocente> gruposxdocentes;

	//bi-directional many-to-one association to ReporteActividad
	@OneToMany(mappedBy="docente")
	@JsonManagedReference
	private List<ReporteActividad> reporteActividades;

	public Docente() {
	}

	public Integer getDoceId() {
		return this.doceId;
	}

	public void setDoceId(Integer doceId) {
		this.doceId = doceId;
	}

	public String getDoceDepartamento() {
		return this.doceDepartamento;
	}

	public void setDoceDepartamento(String doceDepartamento) {
		this.doceDepartamento = doceDepartamento;
	}

	public Integer getDoceExperiencia() {
		return this.doceExperiencia;
	}

	public void setDoceExperiencia(Integer doceExperiencia) {
		this.doceExperiencia = doceExperiencia;
	}

	public String getDoceTitulo() {
		return this.doceTitulo;
	}

	public void setDoceTitulo(String doceTitulo) {
		this.doceTitulo = doceTitulo;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Grupoxdocente> getGruposxdocentes() {
		return this.gruposxdocentes;
	}

	public void setGruposxdocentes(List<Grupoxdocente> gruposxdocentes) {
		this.gruposxdocentes = gruposxdocentes;
	}

	public Grupoxdocente addGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().add(gruposxdocente);
		gruposxdocente.setDocente(this);

		return gruposxdocente;
	}

	public Grupoxdocente removeGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().remove(gruposxdocente);
		gruposxdocente.setDocente(null);

		return gruposxdocente;
	}

	public List<ReporteActividad> getReporteActividades() {
		return this.reporteActividades;
	}

	public void setReporteActividades(List<ReporteActividad> reporteActividades) {
		this.reporteActividades = reporteActividades;
	}

	public ReporteActividad addReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().add(reporteActividade);
		reporteActividade.setDocente(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setDocente(null);

		return reporteActividade;
	}

}