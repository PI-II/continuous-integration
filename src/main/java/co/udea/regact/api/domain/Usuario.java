package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"USUARIOS\"")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="usu_id")
	private Integer usuId;

	@Column(name="usu_password")
	private String usuPassword;

	@OneToOne(mappedBy="usuario", fetch=FetchType.LAZY)
	private Docente docente;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usu_id")
	private Persona persona;

	@ManyToMany
	@JoinTable(
		name="\"USUARIOSXROLES\""
		, joinColumns={
			@JoinColumn(name="usu_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="rol_id")
			}
		)
	private List<Rol> roles;

	public Usuario() {
	}

	public Integer getUsuId() {
		return this.usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public String getUsuPassword() {
		return this.usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Rol> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}