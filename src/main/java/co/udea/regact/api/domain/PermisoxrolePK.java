package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class PermisoxrolePK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="per_id")
	private Integer perId;

	@Column(name="rol_id")
	private Integer rolId;

	public PermisoxrolePK() {
	}
	public Integer getPerId() {
		return this.perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public Integer getRolId() {
		return this.rolId;
	}
	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PermisoxrolePK)) {
			return false;
		}
		PermisoxrolePK castOther = (PermisoxrolePK)other;
		return 
			this.perId.equals(castOther.perId)
			&& this.rolId.equals(castOther.rolId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.perId.hashCode();
		hash = hash * prime + this.rolId.hashCode();
		
		return hash;
	}
}