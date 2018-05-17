package co.udea.regact.api.dto;

import java.io.Serializable;


public class GrupoDocenteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idDocente;
	private int idGrupo;
	private String nombreGrupo;
	private int idCurso;
	private String nombreCurso;
	private int angioSemestre;
	private int semestre;
	private int horasReportadas;
	private int horasCurso;
	private String estadoCurso;
	private String estadoGrupo;
	
	public GrupoDocenteDTO() {
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
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public int getAngioSemestre() {
		return angioSemestre;
	}
	public void setAngioSemestre(int angioSemestre) {
		this.angioSemestre = angioSemestre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getHorasReportadas() {
		return horasReportadas;
	}
	public void setHorasReportadas(int horasReportadas) {
		this.horasReportadas = horasReportadas;
	}
	public int getHorasCurso() {
		return horasCurso;
	}
	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getEstadoCurso() {
		return estadoCurso;
	}
	public void setEstadoCurso(String estadoCurso) {
		this.estadoCurso = estadoCurso;
	}
	public String getEstadoGrupo() {
		return estadoGrupo;
	}
	public void setEstadoGrupo(String estadoGrupo) {
		this.estadoGrupo = estadoGrupo;
	}
	
	
	

}
