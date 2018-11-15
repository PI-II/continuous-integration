package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="\"PERMISOSXROLES\"")
public class Permisoxrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermisoxrolePK id;

	public Permisoxrole() {
	}

	public PermisoxrolePK getId() {
		return this.id;
	}

	public void setId(PermisoxrolePK id) {
		this.id = id;
	}

}