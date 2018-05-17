package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the perfiles database table.
 * 
 */
@Entity
@Table(name="perfiles")
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pil_id")
	private Integer pilId;

	@Column(name="pil_nombre")
	private String pilNombre;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="perfile")
	@JsonManagedReference
	private List<Usuario> usuarios;

	public Perfil() {
	}

	public Integer getPilId() {
		return this.pilId;
	}

	public void setPilId(Integer pilId) {
		this.pilId = pilId;
	}

	public String getPilNombre() {
		return this.pilNombre;
	}

	public void setPilNombre(String pilNombre) {
		this.pilNombre = pilNombre;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setPerfile(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setPerfile(null);

		return usuario;
	}

}