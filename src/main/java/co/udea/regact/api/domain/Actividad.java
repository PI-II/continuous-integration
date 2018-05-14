package co.udea.regact.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVIDADES")
public class Actividad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="act_id")
	private int id;
	
	@Column(name="act_nombre")
	private String nombre;
	
	@Column(name="act_descripcion")
	private String descripcion;
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}

	public Actividad(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}



	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
