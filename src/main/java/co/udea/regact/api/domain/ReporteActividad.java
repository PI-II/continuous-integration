package co.udea.regact.api.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;
import javax.persistence.NamedSubgraph;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the reporte_actividades database table.
 * 
 */
@Entity
@Table(name="reporte_actividades")
@NamedQuery(name="ReporteActividad.findAll", query="SELECT r FROM ReporteActividad r")
@NamedEntityGraph(name="findDocenteReport", 
							attributeNodes= {
									@NamedAttributeNode(value="actividade"),
									@NamedAttributeNode(value="docente"),
									@NamedAttributeNode(value="grupo", subgraph="curso"),
									@NamedAttributeNode(value="semestre", subgraph="semestre")
									//,@NamedAttributeNode(value="semestre.estado", subgraph="mestre.estado")
									},
							subgraphs= {
									@NamedSubgraph(name="curso", attributeNodes = @NamedAttributeNode("curso")),
									@NamedSubgraph(name="semestre", attributeNodes = @NamedAttributeNode("estado"))
									
							}
)
public class ReporteActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rep_id")
	private Long repId;
	
	@Column(name="act_id", insertable=true, updatable=false)
	private Integer idActividad;
	
	@Column(name="doce_id", insertable=true, updatable=false)
	private Integer idDocente;
	
	@Column(name="gru_id", insertable=true, updatable=false)
	private Integer idGrupo;
	
	//, nullable=false, insertable=false, updatable=false
	@Column(name="sem_id", insertable=true, updatable=false)
	private Integer idSemestre;

	@Temporal(TemporalType.DATE)
	@Column(name="rep_fecha")
	private Date repFecha;

	@Column(name="rep_horas")
	private Integer repHoras;

	@Column(name="rep_observaciones")
	private String repObservaciones;

	//bi-directional many-to-one association to Actividad
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="act_id", insertable = false, updatable = false)
	private Actividad actividade;

	//bi-directional many-to-one association to Docente
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="doce_id", insertable = false, updatable = false)
	private Docente docente;

	//bi-directional many-to-one association to Grupo
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="gru_id", insertable = false, updatable = false)
	private Grupo grupo;

	//bi-directional many-to-one association to Grupoxdocente
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumns({
		@JoinColumn(name="doce_id", referencedColumnName="id_docente", insertable = false, updatable = false),
		@JoinColumn(name="gru_id", referencedColumnName="id_grupo", insertable = false, updatable = false),
		@JoinColumn(name="sem_id", referencedColumnName="id_semestre", insertable = false, updatable = false)
		})
	private Grupoxdocente gruposxdocente;

	//bi-directional many-to-one association to Semestre
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="sem_id", insertable = false, updatable = false, nullable = false)
	private Semestre semestre;

	public ReporteActividad() {
	}

	public Long getRepId() {
		return this.repId;
	}

	public void setRepId(Long repId) {
		this.repId = repId;
	}

	public Date getRepFecha() {
		return this.repFecha;
	}

	public void setRepFecha(Date repFecha) {
		this.repFecha = repFecha;
	}

	public Integer getRepHoras() {
		return this.repHoras;
	}

	public void setRepHoras(Integer repHoras) {
		this.repHoras = repHoras;
	}

	public String getRepObservaciones() {
		return this.repObservaciones;
	}

	public void setRepObservaciones(String repObservaciones) {
		this.repObservaciones = repObservaciones;
	}

	public Actividad getActividade() {
		return this.actividade;
	}

	public void setActividade(Actividad actividade) {
		this.actividade = actividade;
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

	public Grupoxdocente getGruposxdocente() {
		return this.gruposxdocente;
	}

	public void setGruposxdocente(Grupoxdocente gruposxdocente) {
		this.gruposxdocente = gruposxdocente;
	}

	public Semestre getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Integer getAct_id() {
		return idActividad;
	}

	public void setAct_id(Integer act_id) {
		this.idActividad = act_id;
	}

	public Integer getDoce_id() {
		return idDocente;
	}

	public void setDoce_id(Integer doce_id) {
		this.idDocente = doce_id;
	}

	public Integer getGru_id() {
		return idGrupo;
	}

	public void setGru_id(Integer gru_id) {
		this.idGrupo = gru_id;
	}

	public Integer getSem_id() {
		return idSemestre;
	}

	public void setSem_id(Integer sem_id) {
		this.idSemestre = sem_id;
	}

}