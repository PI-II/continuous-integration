package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"ACTIVIDADES\"")
public class Actividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="act_id")
	private Integer actId;

	@Column(name="act_descripcion")
	private String actDescripcion;

	@OneToMany(mappedBy="actividade")
	private List<ReporteActividad> reporteActividades;

	public Actividad() {
	}

	public Integer getActId() {
		return this.actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public String getActDescripcion() {
		return this.actDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		this.actDescripcion = actDescripcion;
	}

	public List<ReporteActividad> getReporteActividades() {
		return this.reporteActividades;
	}

	public void setReporteActividades(List<ReporteActividad> reporteActividades) {
		this.reporteActividades = reporteActividades;
	}

	public ReporteActividad addReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().add(reporteActividade);
		reporteActividade.setActividade(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setActividade(null);

		return reporteActividade;
	}

}