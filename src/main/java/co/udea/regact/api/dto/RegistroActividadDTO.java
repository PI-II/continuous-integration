package co.udea.regact.api.dto;

import java.io.Serializable;

public class RegistroActividadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idDocente;
	private int idGrupo;
	
	public RegistroActividadDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	

}
