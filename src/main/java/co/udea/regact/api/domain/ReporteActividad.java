package co.udea.regact.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reporte_actividades")
public class ReporteActividad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "repo_id")
	private long id;
	
	@Column(name = "doce_id")
	private int id_docente;
	
	@Column(name = "gru_id")
	private int id_grupo;
	
	@Column(name = "sem_id")
	private int id_semestre;
	
	@Column(name = "act_id")
	private int id_actividad;
	
	@Column(name = "rep_fecha")
	@Temporal(value=TemporalType.DATE)
	private Date fecha_reporte;
	
	@Column(name = "rep_horas")
	private int horas;
	
	@Column(name = "rep_observaciones")
	private String observaciones;
	

	public ReporteActividad() {
		// TODO Auto-generated constructor stub
	}
	
	public ReporteActividad(int id_docente, int id_grupo, int id_semestre, int id_actividad, Date fecha_reporte,
			int horas, String observaciones) {
		super();
		this.id_docente = id_docente;
		this.id_grupo = id_grupo;
		this.id_semestre = id_semestre;
		this.id_actividad = id_actividad;
		this.fecha_reporte = fecha_reporte;
		this.horas = horas;
		this.observaciones = observaciones;
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	public int getId_semestre() {
		return id_semestre;
	}

	public void setId_semestre(int id_semestre) {
		this.id_semestre = id_semestre;
	}

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
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
	
	

}
