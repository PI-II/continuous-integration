package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="\"PERSONAS\"")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="per_id")
	private Integer perId;

	@Column(name="per_email")
	private String perEmail;

	@Column(name="per_estado")
	private Boolean perEstado;

	@Column(name="per_nombre")
	private String perNombre;

	@OneToOne(mappedBy="persona", fetch=FetchType.LAZY)
	private Usuario usuario;

	public Persona() {
	}

	public Integer getPerId() {
		return this.perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerEmail() {
		return this.perEmail;
	}

	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	public Boolean getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(Boolean perEstado) {
		this.perEstado = perEstado;
	}

	public String getPerNombre() {
		return this.perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}