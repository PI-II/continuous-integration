package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="\"PERMISOS\"")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="per_id")
	private Integer perId;

	@Column(name="per_descripcion")
	private String perDescripcion;

	public Permiso() {
	}

	public Integer getPerId() {
		return this.perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerDescripcion() {
		return this.perDescripcion;
	}

	public void setPerDescripcion(String perDescripcion) {
		this.perDescripcion = perDescripcion;
	}

}