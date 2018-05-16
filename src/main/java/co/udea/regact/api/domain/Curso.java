package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"CURSOS\"")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cur_id")
	private Integer curId;

	@Column(name="cur_estado")
	private Boolean curEstado;

	@Column(name="cur_horas")
	private Integer curHoras;

	@Column(name="cur_nombre")
	private String curNombre;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="curso")
	private List<Grupo> grupos;

	public Curso() {
	}

	public Integer getCurId() {
		return this.curId;
	}

	public void setCurId(Integer curId) {
		this.curId = curId;
	}

	public Boolean getCurEstado() {
		return this.curEstado;
	}

	public void setCurEstado(Boolean curEstado) {
		this.curEstado = curEstado;
	}

	public Integer getCurHoras() {
		return this.curHoras;
	}

	public void setCurHoras(Integer curHoras) {
		this.curHoras = curHoras;
	}

	public String getCurNombre() {
		return this.curNombre;
	}

	public void setCurNombre(String curNombre) {
		this.curNombre = curNombre;
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