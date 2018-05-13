package co.udea.regact.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rol_id")
	private int id;
	
	@Column(name="rol_nombre")
	private String nombre;
	
	public Rol() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rol(String nombre) {
		super();
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
