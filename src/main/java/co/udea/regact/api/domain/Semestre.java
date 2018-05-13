package co.udea.regact.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEMESTRES")
public class Semestre {
	
	@Id
	@Column(name = "sem_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "sem_nombre")
	private String nombre;
	
	@Column(name = "sem_fechainicio")
	private Date fechaInicio;
	
	@Column(name = "sem_fechafin")
	private Date fechaFinal;
	
	@Column(name = "sem_ano")
	private int agnio;
	
	@Column(name = "sem_semestre")
	private int semestre;

	@Column(name = "est_id")
	private int idEstado;
	
	
	public Semestre() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Semestre(String nombre, Date fechaInicio, Date fechaFinal, int agnio, int semestre, int idEstado) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.agnio = agnio;
		this.semestre = semestre;
		this.idEstado = idEstado;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public int getAgnio() {
		return agnio;
	}

	public int getSemestre() {
		return semestre;
	}

	public int getIdEstado() {
		return idEstado;
	}

}
