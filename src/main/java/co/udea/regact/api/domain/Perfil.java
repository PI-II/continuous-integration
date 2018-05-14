package co.udea.regact.api.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "perfiles")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pil_id")
	private Integer id;
	
	@Column(name = "pil_nombre")
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPerfil", targetEntity = Usuario.class)
	List<Usuario> usuarios;
	
	public Perfil() {
		
	}
	
	public Perfil(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

}
