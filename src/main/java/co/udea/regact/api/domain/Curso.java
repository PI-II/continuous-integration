	package co.udea.regact.api.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cur_id")
	private Integer id;
	
	@Column(name = "cur_nombre")
	private String nombre;
	
	@Column(name = "cur_estado")
	private Boolean estado;
	
	@Column(name = "cur_horas")
	private int horas;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cur_id", targetEntity = Grupo.class)
	private Set<Grupo> grupos;
	
	public Curso() {
		
	}
	
	public Curso(String nombre, Boolean estado, int horas) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.horas = horas;
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

	
	public int getCantidadHoras() {
		return horas;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.horas = cantidadHoras;
	}
	
	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
