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
@Table(name="estados")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "est_id")
	private int id;
	
	@Column(name="est_nombre")
	private String nombre;
	
	@Column(name="est_descripcion")
	private String descripcion;
	
	@Column(name = "ate_id")
	private int idAgente;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEstado", targetEntity = Grupo.class)
	private Set<Grupo> grupos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEstado", targetEntity = Usuario.class)
	private Set<Usuario> usuarios;
	
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}

	public Estado(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	
	public int getIdAgente() {
		return idAgente;
	}
	
	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}
	
	public Set<Grupo> getGrupos() {
		return grupos;
	}
	
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
}
