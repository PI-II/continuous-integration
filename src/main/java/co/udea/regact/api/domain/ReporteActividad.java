package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;


/**
 * The persistent class for the reporte_actividades database table.
 * 
 */
@Entity
@Table(name="reporte_actividades")
@NamedQuery(name="ReporteActividad.findAll", query="SELECT r FROM ReporteActividad r")
public class ReporteActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rep_id")
	private Long repId;

	@Temporal(TemporalType.DATE)
	@Column(name="rep_fecha")
	private Date repFecha;

	@Column(name="rep_horas")
	private Integer repHoras;

	@Column(name="rep_observaciones")
	private String repObservaciones;

	//bi-directional many-to-one association to Actividad
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="act_id", insertable = false, updatable = false, nullable = false)
	private Actividad actividade;

	//bi-directional many-to-one association to Docente
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="doce_id", insertable = false, updatable = false, nullable = false)
	private Docente docente;

	//bi-directional many-to-one association to Grupo
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="gru_id", insertable = false, updatable = false, nullable = false)
	private Grupo grupo;

	//bi-directional many-to-one association to Grupoxdocente
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumns({
		@JoinColumn(name="doce_id", referencedColumnName="id_docente"),
		@JoinColumn(name="gru_id", referencedColumnName="id_grupo"),
		@JoinColumn(name="sem_id", referencedColumnName="id_semestre")
		})
	private Grupoxdocente gruposxdocente;

	//bi-directional many-to-one association to Semestre
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="sem_id", insertable = false, updatable = false, nullable = false)
	private Semestre semestre;

	public ReporteActividad() {
	}

	public Long getRepId() {
		return this.repId;
	}

	public void setRepId(Long repId) {
		this.repId = repId;
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

	public Grupoxdocente getGruposxdocente() {
		return this.gruposxdocente;
	}

	public void setGruposxdocente(Grupoxdocente gruposxdocente) {
		this.gruposxdocente = gruposxdocente;
	}

	public Semestre getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}