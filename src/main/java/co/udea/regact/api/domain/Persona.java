package co.udea.regact.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "per_id")
	private Integer id;
	
	@Column(name = "per_identificacion")
	private String identificacion;
	
	@Column(name = "per_nombre")
	private String nombre;
	
	@Column(name = "per_email")
	private String email;
	
	@OneToOne(optional = true, fetch = FetchType.LAZY, mappedBy = "idPersona", targetEntity = Docente.class) 
	private Docente docente;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(Integer id, String identificacion, String nombre, String email) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}
