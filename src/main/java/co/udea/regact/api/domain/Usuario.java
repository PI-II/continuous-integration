package co.udea.regact.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usu_id")
	private int id;
	
	@Column(name = "usu_email", unique = true)
	private String email;
	
	@Column(name = "usu_password")
	private String password;
	
	@Column(name = "est_id")
	private int idEstado;
	
	@Column(name = "per_id")
	private int idPersona;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "est_id", insertable = false, nullable = false, updatable = false)
	private Estado estado;
	
	@OneToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "idPersona", insertable = false, nullable = false, updatable = false)
	private Persona persona;
	

	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Usuario(int id, String email, String password, int idEstado, int idPersona, Estado estado, Persona persona) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.idEstado = idEstado;
		this.idPersona = idPersona;
		this.estado = estado;
		this.persona = persona;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int getIdEstado() {
		return idEstado;
	}
	
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

}
