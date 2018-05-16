package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="\"DOCENTES\"")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doce_id")
	private Integer doceId;

	@Column(name="doce_departamento")
	private String doceDepartamento;

	@Column(name="doce_experiencia")
	private Integer doceExperiencia;

	@Column(name="doce_titulo")
	private String doceTitulo;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doce_id")
	private Usuario usuario;

	@ManyToMany(mappedBy="docentes")
	private List<Grupo> grupos;

	@OneToMany(mappedBy="docente")
	private List<ReporteActividad> reporteActividades;

	public Docente() {
	}

	public Integer getDoceId() {
		return this.doceId;
	}

	public void setDoceId(Integer doceId) {
		this.doceId = doceId;
	}

	public String getDoceDepartamento() {
		return this.doceDepartamento;
	}

	public void setDoceDepartamento(String doceDepartamento) {
		this.doceDepartamento = doceDepartamento;
	}

	public Integer getDoceExperiencia() {
		return this.doceExperiencia;
	}

	public void setDoceExperiencia(Integer doceExperiencia) {
		this.doceExperiencia = doceExperiencia;
	}

	public String getDoceTitulo() {
		return this.doceTitulo;
	}

	public void setDoceTitulo(String doceTitulo) {
		this.doceTitulo = doceTitulo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public List<ReporteActividad> getReporteActividades() {
		return this.reporteActividades;
	}

	public void setReporteActividades(List<ReporteActividad> reporteActividades) {
		this.reporteActividades = reporteActividades;
	}

	public ReporteActividad addReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().add(reporteActividade);
		reporteActividade.setDocente(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setDocente(null);

		return reporteActividade;
	}

}