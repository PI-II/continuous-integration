package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class ReporteActividadPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="doce_id", insertable=false, updatable=false)
	private Integer doceId;

	@Column(name="gru_id", insertable=false, updatable=false)
	private Integer gruId;

	@Column(name="sem_id", insertable=false, updatable=false)
	private Integer semId;

	@Column(name="act_id", insertable=false, updatable=false)
	private Integer actId;

	public ReporteActividadPK() {
	}
	public Integer getDoceId() {
		return this.doceId;
	}
	public void setDoceId(Integer doceId) {
		this.doceId = doceId;
	}
	public Integer getGruId() {
		return this.gruId;
	}
	public void setGruId(Integer gruId) {
		this.gruId = gruId;
	}
	public Integer getSemId() {
		return this.semId;
	}
	public void setSemId(Integer semId) {
		this.semId = semId;
	}
	public Integer getActId() {
		return this.actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReporteActividadPK)) {
			return false;
		}
		ReporteActividadPK castOther = (ReporteActividadPK)other;
		return 
			this.doceId.equals(castOther.doceId)
			&& this.gruId.equals(castOther.gruId)
			&& this.semId.equals(castOther.semId)
			&& this.actId.equals(castOther.actId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.doceId.hashCode();
		hash = hash * prime + this.gruId.hashCode();
		hash = hash * prime + this.semId.hashCode();
		hash = hash * prime + this.actId.hashCode();
		
		return hash;
	}
}