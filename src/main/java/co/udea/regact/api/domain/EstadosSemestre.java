package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"ESTADOS_SEMESTRE\"")
public class EstadosSemestre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="est_id")
	private Integer estId;

	@Column(name="est_descripcion")
	private String estDescripcion;

	@OneToMany(mappedBy="estadosSemestre")
	private List<Semestre> semestres;

	public EstadosSemestre() {
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

	public List<Semestre> getSemestres() {
		return this.semestres;
	}

	public void setSemestres(List<Semestre> semestres) {
		this.semestres = semestres;
	}

	public Semestre addSemestre(Semestre semestre) {
		getSemestres().add(semestre);
		semestre.setEstadosSemestre(this);

		return semestre;
	}

	public Semestre removeSemestre(Semestre semestre) {
		getSemestres().remove(semestre);
		semestre.setEstadosSemestre(null);

		return semestre;
	}

}