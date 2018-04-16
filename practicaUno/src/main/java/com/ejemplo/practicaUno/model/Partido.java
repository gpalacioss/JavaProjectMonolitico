package com.ejemplo.practicaUno.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ejemplo.practicaUno.enums.partido.EstatusPartido;
import com.ejemplo.practicaUno.enums.partido.TipoTorneo;


@Entity
@Table(name = "PARTIDO")
public class Partido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2941321086443987673L;

	@Id
	@Column(name = "ID_PARTIDO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPartido;
	
	@Column(name = "ANIO")
	private Integer anio;
	
	@Column(name = "TORNEO")
	@Enumerated(EnumType.STRING)
	private TipoTorneo  torneo;
	
	@Column(name = "JORNADA")
	private Integer jornada;
	
	@Column(name = "FECHA_INICIO_JORNADA ")
	private Date fechaInicioJornada;
	
	@Column(name = "FECHA_FIN_JORNADA")
	private Date fechaFinJornada;
	
	@Column(name = "RESULTADO")
	private String resultado;
	
	@ManyToOne
	@JoinColumn(name = "EQUIPO_LOCAL", referencedColumnName = "ID_EQUIPO")
	private Equipo equipoLocal;
	
	@ManyToOne
	@JoinColumn(name = "EQUIPO_VISITANTE", referencedColumnName = "ID_EQUIPO")
	private Equipo equipoVisitante;
	
	@Column(name = "ESTATUS")
	private EstatusPartido estatus;

	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	

	public TipoTorneo getTorneo() {
		return torneo;
	}

	public void setTorneo(TipoTorneo torneo) {
		this.torneo = torneo;
	}

	public Integer getJornada() {
		return jornada;
	}

	public void setJornada(Integer jornada) {
		this.jornada = jornada;
	}

	public Date getFechaInicioJornada() {
		return fechaInicioJornada;
	}

	public void setFechaInicioJornada(Date fechaInicioJornada) {
		this.fechaInicioJornada = fechaInicioJornada;
	}

	public Date getFechaFinJornada() {
		return fechaFinJornada;
	}

	public void setFechaFinJornada(Date fechaFinJornada) {
		this.fechaFinJornada = fechaFinJornada;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public EstatusPartido getEstatus() {
		return estatus;
	}

	public void setEstatus(EstatusPartido estatus) {
		this.estatus = estatus;
	}

	
}
