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
	
	@Column(name="act_descripcion")
	private String nombre;
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}
	
	public Actividad(String nombre) {
		super();
		this.nombre = nombre;
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
	
}
