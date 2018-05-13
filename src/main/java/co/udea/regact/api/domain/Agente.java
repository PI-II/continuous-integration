package co.udea.regact.api.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agentes")
public class Agente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ate_id")
	private Integer id;
	
	@Column(name = "ate_name", unique = true)
	private String nombre;
	
	@Column(name = "ate_descripcion", unique = true)
	private String descripcion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idAgente", targetEntity = Estado.class)
	private Set<Estado> estados;
	
	public Agente() {
		// TODO Auto-generated constructor stub
	}
	

	public Agente(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Set<Estado> getEstados() {
		return estados;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
