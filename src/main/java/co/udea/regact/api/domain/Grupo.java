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
	
	@Column(name = "gru_cant_estudiantes")
	private int cantidadEstudiantes;
	
	@Column(name = "gru_diasclase")
	private String  diaclase;
	
	@Column(name = "gru_horainicial")
	@Temporal(TemporalType.TIME)
	private Date  horainicial;
	
	@Column(name = "gru_horafinal")
	@Temporal(TemporalType.TIME)
	private Date  horafinal;
	
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
	


	public Grupo(Integer id, String nombre, int cantidadEstudiantes, String diaclase, Date horainicial, Date horafinal,
			int idEstado, Integer cur_id, Date fechaInicio, Date fechaFin, Curso curso, Estado estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadEstudiantes = cantidadEstudiantes;
		this.diaclase = diaclase;
		this.horainicial = horainicial;
		this.horafinal = horafinal;
		this.idEstado = idEstado;
		this.cur_id = cur_id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.curso = curso;
		this.estado = estado;
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
		return cantidadEstudiantes;
	}

	public void setCantidadestudiantes(int cantidadestudiantes) {
		this.cantidadEstudiantes = cantidadestudiantes;
	}

	public String getDiaclase() {
		return diaclase;
	}

	public void setDiaclase(String diaclase) {
		this.diaclase = diaclase;
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



	public int getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}



	public void setCantidadEstudiantes(int cantidadEstudiantes) {
		this.cantidadEstudiantes = cantidadEstudiantes;
	}



	public Date getHorainicial() {
		return horainicial;
	}



	public void setHorainicial(Date horainicial) {
		this.horainicial = horainicial;
	}



	public Date getHorafinal() {
		return horafinal;
	}



	public void setHorafinal(Date horafinal) {
		this.horafinal = horafinal;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
