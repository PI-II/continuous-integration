package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the grupos database table.
 * 
 */
@Entity
@Table(name="grupos")
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gru_id")
	private Integer gruId;

	@Column(name="gru_cant_estudiantes")
	private Integer gruCantEstudiantes;

	@Column(name="gru_diasclase")
	private String gruDiasclase;

	@Temporal(TemporalType.DATE)
	@Column(name="gru_fechafin")
	private Date gruFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="gru_fechainicio")
	private Date gruFechainicio;

	@Column(name="gru_horafinal")
	private Time gruHorafinal;

	@Column(name="gru_horainicial")
	private Time gruHorainicial;

	@Column(name="gru_nombre")
	private String gruNombre;

	//bi-directional many-to-one association to Curso
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="cur_id")
	private Curso curso;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="est_id")
	private Estado estado;

	//bi-directional many-to-one association to Grupoxdocente
	@OneToMany(mappedBy="grupo")
	@JsonManagedReference
	private List<Grupoxdocente> gruposxdocentes;

	//bi-directional many-to-one association to ReporteActividad
	@OneToMany(mappedBy="grupo")
	@JsonManagedReference
	private List<ReporteActividad> reporteActividades;

	//bi-directional many-to-many association to Semestre
	@ManyToMany(mappedBy="grupos")
	@JsonManagedReference
	private List<Semestre> semestres;

	public Grupo() {
	}

	public Integer getGruId() {
		return this.gruId;
	}

	public void setGruId(Integer gruId) {
		this.gruId = gruId;
	}

	public Integer getGruCantEstudiantes() {
		return this.gruCantEstudiantes;
	}

	public void setGruCantEstudiantes(Integer gruCantEstudiantes) {
		this.gruCantEstudiantes = gruCantEstudiantes;
	}

	public String getGruDiasclase() {
		return this.gruDiasclase;
	}

	public void setGruDiasclase(String gruDiasclase) {
		this.gruDiasclase = gruDiasclase;
	}

	public Date getGruFechafin() {
		return this.gruFechafin;
	}

	public void setGruFechafin(Date gruFechafin) {
		this.gruFechafin = gruFechafin;
	}

	public Date getGruFechainicio() {
		return this.gruFechainicio;
	}

	public void setGruFechainicio(Date gruFechainicio) {
		this.gruFechainicio = gruFechainicio;
	}

	public Time getGruHorafinal() {
		return this.gruHorafinal;
	}

	public void setGruHorafinal(Time gruHorafinal) {
		this.gruHorafinal = gruHorafinal;
	}

	public Time getGruHorainicial() {
		return this.gruHorainicial;
	}

	public void setGruHorainicial(Time gruHorainicial) {
		this.gruHorainicial = gruHorainicial;
	}

	public String getGruNombre() {
		return this.gruNombre;
	}

	public void setGruNombre(String gruNombre) {
		this.gruNombre = gruNombre;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Grupoxdocente> getGruposxdocentes() {
		return this.gruposxdocentes;
	}

	public void setGruposxdocentes(List<Grupoxdocente> gruposxdocentes) {
		this.gruposxdocentes = gruposxdocentes;
	}

	public Grupoxdocente addGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().add(gruposxdocente);
		gruposxdocente.setGrupo(this);

		return gruposxdocente;
	}

	public Grupoxdocente removeGruposxdocente(Grupoxdocente gruposxdocente) {
		getGruposxdocentes().remove(gruposxdocente);
		gruposxdocente.setGrupo(null);

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
		reporteActividade.setGrupo(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setGrupo(null);

		return reporteActividade;
	}

	public List<Semestre> getSemestres() {
		return this.semestres;
	}

	public void setSemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}

}