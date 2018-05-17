package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the agentes database table.
 * 
 */
@Entity
@Table(name="agentes")
@NamedQuery(name="Agente.findAll", query="SELECT a FROM Agente a")
public class Agente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ate_id")
	private Integer ateId;

	@Column(name="ate_descripcion")
	private String ateDescripcion;

	@Column(name="ate_name")
	private String ateName;

	//bi-directional many-to-one association to Estado
	@OneToMany(mappedBy="agente")
	@JsonManagedReference
	private List<Estado> estados;

	public Agente() {
	}

	public Integer getAteId() {
		return this.ateId;
	}

	public void setAteId(Integer ateId) {
		this.ateId = ateId;
	}

	public String getAteDescripcion() {
		return this.ateDescripcion;
	}

	public void setAteDescripcion(String ateDescripcion) {
		this.ateDescripcion = ateDescripcion;
	}

	public String getAteName() {
		return this.ateName;
	}

	public void setAteName(String ateName) {
		this.ateName = ateName;
	}

	public List<Estado> getEstados() {
		return this.estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Estado addEstado(Estado estado) {
		getEstados().add(estado);
		estado.setAgente(this);

		return estado;
	}

	public Estado removeEstado(Estado estado) {
		getEstados().remove(estado);
		estado.setAgente(null);

		return estado;
	}

}