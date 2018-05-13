package co.udea.regact.api.domain;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "grupos")
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gru_id")
	private Integer id;
	
	@Column(name = "gru_nombre")
	private String nombre;
	
	@Column(name = "gru_cantidadestudiantes")
	private int cantidadestudiantes;
	
	@Column(name = "gru_diaclase")
	private String  diaclase;
	
	@Column(name = "gru_horarioclase")
	@Temporal(TemporalType.TIME)
	private Date  horarioclase;
	
	@Column(name = "est_id")
	private int idEstado;
	
	@Column(name = "cur_id")
	private Integer cur_id;
	
	@Column(name = "gru_fechainicio")
	@Temporal(TemporalType.TIME)
	private Date fechaInicio;
	
	@Column(name = "gru_fechafin")
	@Temporal(TemporalType.TIME)
	private Date fechaFin;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cur_id", referencedColumnName = "cur_id",
				nullable = false, insertable = false, updatable = false)
	private Curso curso;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "est_id", referencedColumnName = "est_id",
				nullable = false, insertable = false, updatable = false)
	private Estado estado;

	
	public Grupo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Grupo(String nombre, int cantidadestudiantes, String diaclase, Date horarioclase, int idEstado,
			Integer cur_id, Date fechaInicio, Date fechaFin) {
		super();
		this.nombre = nombre;
		this.cantidadestudiantes = cantidadestudiantes;
		this.diaclase = diaclase;
		this.horarioclase = horarioclase;
		this.idEstado = idEstado;
		this.cur_id = cur_id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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

	public int getCantidadestudiantes() {
		return cantidadestudiantes;
	}

	public void setCantidadestudiantes(int cantidadestudiantes) {
		this.cantidadestudiantes = cantidadestudiantes;
	}

	public String getDiaclase() {
		return diaclase;
	}

	public void setDiaclase(String diaclase) {
		this.diaclase = diaclase;
	}

	public Date getHorarioclase() {
		return horarioclase;
	}

	public void setHorarioclase(Date horarioclase) {
		this.horarioclase = horarioclase;
	}

	public Integer getCur_id() {
		return cur_id;
	}

	public void setCur_id(Integer cur_id) {
		this.cur_id = cur_id;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public int getIdEstado() {
		return idEstado;
	}
	
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
