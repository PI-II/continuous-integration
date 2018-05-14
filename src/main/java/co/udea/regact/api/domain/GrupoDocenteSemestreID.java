package co.udea.regact.api.domain;

import java.io.Serializable;
import java.util.Objects;

public class GrupoDocenteSemestreID implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idGrupo;
	
	private int idDocente;
	
	private int idSemestre;
	
	public GrupoDocenteSemestreID() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getIdGrupo() {
		return idGrupo;
	}



	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}



	public int getIdDocente() {
		return idDocente;
	}



	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}



	public int getIdSemestre() {
		return idSemestre;
	}



	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(idGrupo, idDocente, idSemestre);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof GrupoDocenteSemestreID) {
			GrupoDocenteSemestreID otherId = (GrupoDocenteSemestreID) obj;
			return (otherId.idGrupo == this.idGrupo) 
					&& (otherId.idDocente == this.idDocente) 
					&& (otherId.idSemestre == this.idSemestre);
		}else {
			return false;
		}
	}

}
