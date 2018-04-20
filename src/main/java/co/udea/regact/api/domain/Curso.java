package co.udea.regact.api.domain;

//import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cur_id")
	private Integer id;
	
	@Column(name = "cur_nombre")
	private String nombre;
	
	@Column(name = "cur_cantidadhoras")
	private int cantidadHoras;
	
//	@Column(name = "cur_fechainicio")
//	private LocalDate fechaInicio;
//	
//	@Column(name = "cur_fechafin")
//	private LocalDate fechaFin;
	
	@Column(name = "cur_estado")
	private Boolean estado;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "cursos")
	@JsonBackReference
	private Set<Usuario> usuarios;
	
	public Curso() {
		
	}
	
//	public Curso(String nombre, int cantidadHoras,LocalDate fechaInicio,LocalDate fechaFin,Boolean estado ) {
//		this.nombre = nombre;
//		this.cantidadHoras = cantidadHoras;
////		this.fechaInicio = fechaInicio;
////		this.fechaFin = fechaFin;
//		this.estado = estado;
//	}
//	
//	public Curso(String nombre, int cantidadHoras,LocalDate fechaInicio,LocalDate fechaFin,Boolean estado, Set<Usuario> usuarios) {
//		this(nombre,cantidadHoras,fechaInicio,fechaFin,estado);
//		this.usuarios = usuarios;
//	}
	

	
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

	
	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	
//	public LocalDate getFechaInicio() {
//		return fechaInicio;
//	}
//
//	public void setFechaInicio(LocalDate fechaInicio) {
//		this.fechaInicio = fechaInicio;
//	}
//
//	
//	public LocalDate getFechaFin() {
//		return fechaFin;
//	}
//
//	public void setFechaFin(LocalDate fechaFin) {
//		this.fechaFin = fechaFin;
//	}

	
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
