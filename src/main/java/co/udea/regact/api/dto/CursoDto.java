package co.udea.regact.api.dto;

import java.io.Serializable;

public class CursoDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private int horasPracticas;
	private int horasTeoricas;
	private int horasTotales;
	private int idEstado;
	private String estado;
	
	public CursoDto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasPracticas() {
		return horasPracticas;
	}
	public void setHorasPracticas(int horasPracticas) {
		this.horasPracticas = horasPracticas;
	}
	public int getHorasTeoricas() {
		return horasTeoricas;
	}
	public void setHorasTeoricas(int horasTeoricas) {
		this.horasTeoricas = horasTeoricas;
	}
	public int getHorasTotales() {
		return horasTotales;
	}
	public void setHorasTotales(int horasTotales) {
		this.horasTotales = horasTotales;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
