package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="\"GRUPOS\"")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gru_id")
	private Integer gruId;

	@Column(name="gru_cantidadestudiantes")
	private Integer gruCantidadestudiantes;

	@Column(name="gru_diaclase")
	private String gruDiaclase;

	@Column(name="gru_estado")
	private Boolean gruEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="gru_fechafin")
	private Date gruFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="gru_fechainicio")
	private Date gruFechainicio;

	@Column(name="gru_horarioclase")
	private Time gruHorarioclase;

	@Column(name="gru_nombre")
	private String gruNombre;

	@ManyToMany
	@JoinTable(
		name="\"DOCENTESXGRUPOS\""
		, joinColumns={
			@JoinColumn(name="gru_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="doce_id")
			}
		)
	private List<Docente> docentes;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cur_id")
	private Curso curso;

	@OneToMany(mappedBy="grupo")
	private List<ReporteActividad> reporteActividades;

	@ManyToMany(mappedBy="grupos")
	private List<Semestre> semestres;

	public Grupo() {
	}

	public Integer getGruId() {
		return this.gruId;
	}

	public void setGruId(Integer gruId) {
		this.gruId = gruId;
	}

	public Integer getGruCantidadestudiantes() {
		return this.gruCantidadestudiantes;
	}

	public void setGruCantidadestudiantes(Integer gruCantidadestudiantes) {
		this.gruCantidadestudiantes = gruCantidadestudiantes;
	}

	public String getGruDiaclase() {
		return this.gruDiaclase;
	}

	public void setGruDiaclase(String gruDiaclase) {
		this.gruDiaclase = gruDiaclase;
	}

	public Boolean getGruEstado() {
		return this.gruEstado;
	}

	public void setGruEstado(Boolean gruEstado) {
		this.gruEstado = gruEstado;
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

	public Time getGruHorarioclase() {
		return this.gruHorarioclase;
	}

	public void setGruHorarioclase(Time gruHorarioclase) {
		this.gruHorarioclase = gruHorarioclase;
	}

	public String getGruNombre() {
		return this.gruNombre;
	}

	public void setGruNombre(String gruNombre) {
		this.gruNombre = gruNombre;
	}

	public List<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
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