package co.udea.regact.api.dto;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReporteActividadDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idDocente;
	private int idGrupo;
	private String nombreGrupo;
	private int idSemestre;
	private String semestre;
	private int idActividad;
	private String nombreActividad;
	private Date fechaReporte;
	private int horas;
	private String observaciones;
	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	
	
	
	public ReporteActividadDto() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

	public int getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public String getFechaReporte() {
		return sdf.format(fechaReporte);
	}
	
	public Date getFechaReporteEntidad() throws ParseException {
		return sdf.parse(getFechaReporte());
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
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
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
