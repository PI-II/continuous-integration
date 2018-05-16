package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="\"ROLES\"")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rol_id")
	private Integer rolId;

	@Column(name="rol_nombre")
	private String rolNombre;

	@ManyToMany(mappedBy="roles")
	private List<Usuario> usuarios;

	public Rol() {
	}

	public Integer getRolId() {
		return this.rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getRolNombre() {
		return this.rolNombre;
	}

	public void setRolNombre(String rolNombre) {
		this.rolNombre = rolNombre;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}