package co.udea.regact.api.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "semestres")
public class Semestre {
	
	@Id
	@Column(name = "sem_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "sem_nombre")
	private String nombre;
	
	@Column(name = "sem_fechainicio")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	
	@Column(name = "sem_fechafin")
	@Temporal(TemporalType.DATE)
	private Date fechaFinal;
	
	@Column(name = "sem_ano")
	private int agnio;
	
	@Column(name = "sem_semestre")
	private int semestre;

	@Column(name = "est_id")
	private int idEstado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "est_id", referencedColumnName = "est_id", 
				nullable = false, insertable = false, updatable = false)
	private Estado estado;
	
	
	@ManyToMany
	@JoinTable(
			name="semestresxgrupos",
			joinColumns=@JoinColumn(name="sem_id", referencedColumnName="sem_id"),
			inverseJoinColumns=@JoinColumn(name="gru_id", referencedColumnName="gru_id")
			)
	private List<Grupo> grupos;
	
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
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
