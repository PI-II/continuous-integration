package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the cursos database table.
 * 
 */
@Entity
@Table(name="cursos")
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cur_id")
	private Integer curId;

	@Column(name="cur_hpracticas")
	private Integer curHpracticas;

	@Column(name="cur_hteoricas")
	private Integer curHteoricas;

	@Column(name="cur_nombre")
	private String curNombre;

	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="est_id")
	@JsonBackReference
	private Estado estado;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="curso")
	@JsonManagedReference
	private List<Grupo> grupos;

	public Curso() {
	}

	public Integer getCurId() {
		return this.curId;
	}

	public void setCurId(Integer curId) {
		this.curId = curId;
	}

	public Integer getCurHpracticas() {
		return this.curHpracticas;
	}

	public void setCurHpracticas(Integer curHpracticas) {
		this.curHpracticas = curHpracticas;
	}

	public Integer getCurHteoricas() {
		return this.curHteoricas;
	}

	public void setCurHteoricas(Integer curHteoricas) {
		this.curHteoricas = curHteoricas;
	}

	public String getCurNombre() {
		return this.curNombre;
	}

	public void setCurNombre(String curNombre) {
		this.curNombre = curNombre;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Grupo addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
		grupo.setCurso(this);

		return grupo;
	}

	public Grupo removeGrupo(Grupo grupo) {
		getGrupos().remove(grupo);
		grupo.setCurso(null);

		return grupo;
	}

}