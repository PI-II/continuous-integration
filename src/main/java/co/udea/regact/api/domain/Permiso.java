package co.udea.regact.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permisos")
public class Permiso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "per_id")
	private Integer id;
	
	@Column(name = "per_nombre")
	private String nombre;
	
	@Column(name = "per_descripcion")
	private String descripcion;
	
	public Permiso() {
		// TODO Auto-generated constructor stub
	}

	public Permiso(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
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
