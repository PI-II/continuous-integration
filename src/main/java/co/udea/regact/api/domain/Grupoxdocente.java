package co.udea.regact.api.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the gruposxdocentes database table.
 * 
 */
@Entity
@Table(name="gruposxdocentes")
@NamedQuery(name="Grupoxdocente.findAll", query="SELECT g FROM Grupoxdocente g")
@NamedEntityGraph(name="grupos.docente.estado",
				attributeNodes= {
						@NamedAttributeNode(value="grupo", subgraph="curso"),
						@NamedAttributeNode(value="semestre", subgraph="semestre")
						//,@NamedAttributeNode(value="semestre.estado", subgraph="mestre.estado")
						},
				subgraphs= {
						@NamedSubgraph(name="curso", attributeNodes = @NamedAttributeNode("curso")),
						@NamedSubgraph(name="semestre", attributeNodes = @NamedAttributeNode("estado"))
						//,@NamedSubgraph(name="semestre.estado", attributeNodes= @NamedAttributeNode("estado"))
						
}
)
public class Grupoxdocente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GrupoxdocentePK id;

	@Column(name="gdte_horas")
	private Integer gdteHoras;

	//bi-directional many-to-one association to Docente
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="id_docente", insertable = false, updatable = false, nullable = false)
	private Docente docente;

	//bi-directional many-to-one association to Grupo
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="id_grupo", insertable = false, updatable = false, nullable = false)
	private Grupo grupo;

	//bi-directional many-to-one association to Semestre
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="id_semestre", insertable = false, updatable = false, nullable = false)
	private Semestre semestre;

	//bi-directional many-to-one association to ReporteActividad
	@OneToMany(mappedBy="gruposxdocente")
	@JsonManagedReference
	private List<ReporteActividad> reporteActividades;

	public Grupoxdocente() {
	}

	public GrupoxdocentePK getId() {
		return this.id;
	}

	public void setId(GrupoxdocentePK id) {
		this.id = id;
	}

	public Integer getGdteHoras() {
		return this.gdteHoras;
	}

	public void setGdteHoras(Integer gdteHoras) {
		this.gdteHoras = gdteHoras;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Semestre getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public List<ReporteActividad> getReporteActividades() {
		return this.reporteActividades;
	}

	public void setReporteActividades(List<ReporteActividad> reporteActividades) {
		this.reporteActividades = reporteActividades;
	}

	public ReporteActividad addReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().add(reporteActividade);
		reporteActividade.setGruposxdocente(this);

		return reporteActividade;
	}

	public ReporteActividad removeReporteActividade(ReporteActividad reporteActividade) {
		getReporteActividades().remove(reporteActividade);
		reporteActividade.setGruposxdocente(null);

		return reporteActividade;
	}

}