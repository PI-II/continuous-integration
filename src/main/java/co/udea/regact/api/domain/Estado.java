package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the estados database table.
 * 
 */
@Entity
@Table(name="estados")
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="est_id")
	private Integer estId;

	@Column(name="est_descripcion")
	private String estDescripcion;

	@Column(name="est_nombre")
	private String estNombre;

	//bi-directional many-to-one association to Curso
	@OneToMany(mappedBy="estado")
	@JsonManagedReference
	private List<Curso> cursos;

	//bi-directional many-to-one association to Agente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ate_id")
	@JsonBackReference
	private Agente agente;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="estado")
	@JsonManagedReference
	private List<Grupo> grupos;

	//bi-directional many-to-one association to Semestre
	@OneToMany(mappedBy="estado")
	@JsonManagedReference
	private List<Semestre> semestres;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="estado")
	@JsonManagedReference
	private List<Usuario> usuarios;

	public Estado() {
	}

	public Integer getEstId() {
		return this.estId;
	}

	public void setEstId(Integer estId) {
		this.estId = estId;
	}

	public String getEstDescripcion() {
		return this.estDescripcion;
	}

	public void setEstDescripcion(String estDescripcion) {
		this.estDescripcion = estDescripcion;
	}

	public String getEstNombre() {
		return this.estNombre;
	}

	public void setEstNombre(String estNombre) {
		this.estNombre = estNombre;
	}

	public List<Curso> getCursos() {
		return this.cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Curso addCurso(Curso curso) {
		getCursos().add(curso);
		curso.setEstado(this);

		return curso;
	}

	public Curso removeCurso(Curso curso) {
		getCursos().remove(curso);
		curso.setEstado(null);

		return curso;
	}

	public Agente getAgente() {
		return this.agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Grupo addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
		grupo.setEstado(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setEstado(null);

		return grupo;
	}

	public List<Semestre> getSemestres() {
		return this.semestres;
	}

	public void setSemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}

	public Semestre addSemestre(Semestre semestre) {
		getSemestres().add(semestre);
		semestre.setEstado(this);

		return semestre;
	}

	public Semestre removeSemestre(Semestre semestre) {
		getSemestres().remove(semestre);
		semestre.setEstado(null);

		return semestre;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setEstado(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setEstado(null);

		return usuario;
	}

}