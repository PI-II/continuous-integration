	package co.udea.regact.api.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@Column(name = "est_id")
	private int idEstado;
	
	@Column(name = "cur_hteoricas")
	private int horasTeoricas;
	
	@Column(name = "cur_hpracticas")
	private int horasPracticas;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "est_id", referencedColumnName = "est_id",
				nullable = false, insertable = false, updatable = false)
	private Estado estado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cur_id", targetEntity = Grupo.class)
	private Set<Grupo> grupos;
	
	public Curso() {
		
	}

	public Curso(Integer id, String nombre, int idEstado, int horasTeoricas, int horasPracticas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idEstado = idEstado;
		this.horasTeoricas = horasTeoricas;
		this.horasPracticas = horasPracticas;
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

	public int getIdEstado() {
		return idEstado;
	}


	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public Set<Grupo> getGrupos() {
		return grupos;
	}


	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public int getHorasTeoricas() {
		return horasTeoricas;
	}

	public void setHorasTeoricas(int horasTeoricas) {
		this.horasTeoricas = horasTeoricas;
	}

	public int getHorasPracticas() {
		return horasPracticas;
	}

	public void setHorasPracticas(int horasPracticas) {
		this.horasPracticas = horasPracticas;
	}


}
