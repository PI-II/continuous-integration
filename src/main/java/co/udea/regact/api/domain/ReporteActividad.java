package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="\"REPORTE_ACTIVIDADES\"")
public class ReporteActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReporteActividadPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="rep_fecha")
	private Date repFecha;

	@Column(name="rep_horas")
	private Integer repHoras;

	@Column(name="rep_observaciones")
	private String repObservaciones;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="act_id", insertable=false, updatable=false)
	private Actividad actividade;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doce_id", insertable=false, updatable=false)
	private Docente docente;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="gru_id", insertable=false, updatable=false)
	private Grupo grupo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sem_id", insertable=false, updatable=false)
	private Semestre semestre;

	public ReporteActividad() {
	}

	public ReporteActividadPK getId() {
		return this.id;
	}

	public void setId(ReporteActividadPK id) {
		this.id = id;
	}

	public Date getRepFecha() {
		return this.repFecha;
	}

	public void setRepFecha(Date repFecha) {
		this.repFecha = repFecha;
	}

	public Integer getRepHoras() {
		return this.repHoras;
	}

	public void setRepHoras(Integer repHoras) {
		this.repHoras = repHoras;
	}

	public String getRepObservaciones() {
		return this.repObservaciones;
	}

	public void setRepObservaciones(String repObservaciones) {
		this.repObservaciones = repObservaciones;
	}

	public Actividad getActividade() {
		return this.actividade;
	}

	public void setActividade(Actividad actividade) {
		this.actividade = actividade;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Semestre getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}