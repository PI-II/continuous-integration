package co.udea.regact.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reporte_actividades")
public class ReporteActividad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rep_id")
	private long id;
	
	@Column(name = "doce_id")
	private int idDocente;
	
	@Column(name = "gru_id")
	private int idGrupo;
	
	@Column(name = "sem_id")
	private int idSemestre;
	
	@Column(name = "act_id")
	private int idActividad;
	
	@Column(name = "rep_fecha")
	@Temporal(value=TemporalType.DATE)
	private Date fecha_reporte;
	
	@Column(name = "rep_horas")
	private int horas;
	
	@Column(name = "rep_observaciones")
	private String observaciones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "act_id", referencedColumnName = "act_id",  
				insertable = false, updatable = false, nullable = false)
	private Actividad actividad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doce_id", referencedColumnName = "doce_id",  
				insertable = false, updatable = false, nullable = false)
	private Docente docente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gru_id", referencedColumnName = "gru_id",  
				insertable = false, updatable = false, nullable = false)	
	private Grupo grupo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sem_id", referencedColumnName = "sem_id",  
				insertable = false, updatable = false, nullable = false)	
	private Semestre semestre;
	
	

	public ReporteActividad() {
		// TODO Auto-generated constructor stub
	}
	
	public ReporteActividad(int id_docente, int idGrupo, int idSemestre, int idActividad, Date fecha_reporte,
			int horas, String observaciones) {
		super();
		this.idDocente = id_docente;
		this.idGrupo = idGrupo;
		this.idSemestre = idSemestre;
		this.idActividad = idActividad;
		this.fecha_reporte = fecha_reporte;
		this.horas = horas;
		this.observaciones = observaciones;
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setId_docente(int idDocente) {
		this.idDocente = idDocente;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setId_grupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setId_semestre(int id_semestre) {
		this.idSemestre = id_semestre;
	}

	public int getIdActividad() {
		return idActividad;
	}

	public void setId_actividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public Date getFecha_reporte() {
		return fecha_reporte;
	}

	public void setFecha_reporte(Date fecha_reporte) {
		this.fecha_reporte = fecha_reporte;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public Actividad getActividad() {
		return actividad;
	}
	
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}

}
