package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="\"SEMESTRES\"")
public class Semestre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Column(name="sem_semestre")
	private Boolean semSemestre;

	@OneToMany(mappedBy="semestre")
	private List<ReporteActividad> reporteActividades;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="est_id")
	private EstadosSemestre estadosSemestre;

	@ManyToMany
	@JoinTable(
		name="\"SEMESTRESXGRUPOS\""
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

	public Boolean getSemSemestre() {
		return this.semSemestre;
	}

	public void setSemSemestre(Boolean semSemestre) {
		this.semSemestre = semSemestre;
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

	public EstadosSemestre getEstadosSemestre() {
		return this.estadosSemestre;
	}

	public void setEstadosSemestre(EstadosSemestre estadosSemestre) {
		this.estadosSemestre = estadosSemestre;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

}