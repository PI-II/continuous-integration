package co.udea.regact.api.adapter;

import co.udea.regact.api.domain.Grupoxdocente;
import co.udea.regact.api.dto.GrupoDocenteDTO;
import co.udea.regact.api.exception.AdapterException;

public class GrupoDocenteAdapterImpl extends IGrupoDocenteAdapter {


	
	public GrupoDocenteAdapterImpl(GrupoDocenteDTO dto) {
		this.dto = dto;
	}
	
	public GrupoDocenteAdapterImpl(Grupoxdocente entidad) {
		this.entidad = entidad;
	}
	
	@Override
	public Grupoxdocente getGrupoDocente() throws AdapterException{
		
		if (dto == null) {
			throw new AdapterException("exception.adapter_null.grupo_docente");
		}
		
		return this.entidad;
	}

	@Override
	public GrupoDocenteDTO getGrupoDocenteDTO() {
		
		if (entidad == null) {
			throw new AdapterException("exception.adapter_null.grupo_docente");
		}

		dto = new GrupoDocenteDTO();
		dto.setAngioSemestre(entidad.getSemestre().getSemAno());
		dto.setEstadoCurso(entidad.getGrupo().getCurso().getEstado().getEstNombre());
		dto.setEstadoGrupo(entidad.getGrupo().getEstado().getEstNombre());
		dto.setHorasCurso(entidad.getGrupo().getCurso().getCurHteoricas() + entidad.getGrupo().getCurso().getCurHpracticas());
		dto.setHorasReportadas(entidad.getGdteHoras());
		dto.setIdCurso(entidad.getGrupo().getCurso().getCurId());
		dto.setIdDocente(entidad.getDocente().getDoceId());
		dto.setNombreCurso(entidad.getGrupo().getCurso().getCurNombre());
		dto.setNombreGrupo(entidad.getGrupo().getGruNombre());
		dto.setIdGrupo(entidad.getGrupo().getGruId());
		dto.setSemestre(entidad.getSemestre().getSemSemestre());
		dto.setIdSemestre(entidad.getSemestre().getSemId());
		
		return dto;
	}

}
