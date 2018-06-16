package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the semestres database table.
 * 
 */
@Entity
@Table(name="semestres")
@NamedQuery(name="Semestre.findAll", query="SELECT s FROM Semestre s")
public class Semestre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sem_id")
	private Integer semId;

	@Column(name="sem_ano")
	private Integer semAno;

	@Temporal(TemporalType.DATE)
	@Column(name="sem_fechafin")
	private Date semFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="sem_fechainicio")
	private Date semFechainicio;

	@Column(name="sem_nombre")
	private String semNombre;

	@Column(name="sem_semestre")
	private Integer semSemestre;

	//bi-directional many-to-one association to Grupoxdocente
	@OneToMany(mappedBy="semestre")
	@JsonManagedReference
	private List<Grupoxdocente> gruposxdocentes;

	//bi-directional many-to-one association to ReporteActividad
	@OneToMany(mappedBy="semestre")
	@JsonManagedReference
	private List<ReporteActividad> reporteActividades;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="est_id")
	@JsonBackReference
	private Estado estado;

	//bi-directional many-to-many association to Grupo
	@ManyToMany
	@JsonBackReference
	@JoinTable(
		name="semestresxgrupos"
		, joinColumns={
			@JoinColumn(name="sem_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="gru_id")
			}
		)
	private List<Grupo> grupos;

	public Semestre() {
	}

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public Integer getSemAno() {
		return this.semAno;
	}

	public void setSemAno(Integer semAno) {
		this.semAno = semAno;
	}

	public Date getSemFechafin() {
		return this.semFechafin;
	}

	public void setSemFechafin(Date semFechafin) {
		this.semFechafin = semFechafin;
	}

	public Date getSemFechainicio() {
		return this.semFechainicio;
	}

	public void setSemFechainicio(Date semFechainicio) {
		this.semFechainicio = semFechainicio;
	}

	public String getSemNombre() {
		return this.semNombre;
	}

	public void setSemNombre(String semNombre) {
		this.semNombre = semNombre;
	}

	public Integer getSemSemestre() {
		return this.semSemestre;
	}

	public void setSemSemestre(Integer semSemestre) {
		this.semSemestre = semSemestre;
	}

	public List<Grupoxdocente> getGruposxdocentes() {
		return this.gruposxdocentes;
	}

	public void setGruposxdocentes(List<Grupoxdocente> gruposxdocentes) {
		this.gruposxdocentes = gruposxdocentes;
	}

	public Grupoxdocente addGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().add(gruposxdocente);
		gruposxdocente.setSemestre(this);

		return gruposxdocente;
	}

	public Grupoxdocente removeGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().remove(gruposxdocente);
		gruposxdocente.setSemestre(null);

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
		reporteActividade.setSemestre(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setSemestre(null);

		return reporteActividade;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

}