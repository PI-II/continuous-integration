package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the gruposxdocentes database table.
 * 
 */
@Embeddable
public class GrupoxdocentePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_docente", insertable=false, updatable=false)
	private Integer idDocente;

	@Column(name="id_grupo", insertable=false, updatable=false)
	private Integer idGrupo;

	@Column(name="id_semestre", insertable=false, updatable=false)
	private Integer idSemestre;

	public GrupoxdocentePK() {
	}
	public Integer getIdDocente() {
		return this.idDocente;
	}
	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}
	public Integer getIdGrupo() {
		return this.idGrupo;
	}
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	public Integer getIdSemestre() {
		return this.idSemestre;
	}
	public void setIdSemestre(Integer idSemestre) {
		this.idSemestre = idSemestre;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GrupoxdocentePK)) {
			return false;
		}
		GrupoxdocentePK castOther = (GrupoxdocentePK)other;
		return 
			this.idDocente.equals(castOther.idDocente)
			&& this.idGrupo.equals(castOther.idGrupo)
			&& this.idSemestre.equals(castOther.idSemestre);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDocente.hashCode();
		hash = hash * prime + this.idGrupo.hashCode();
		hash = hash * prime + this.idSemestre.hashCode();
		
		return hash;
	}
}