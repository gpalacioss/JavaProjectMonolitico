package com.ejemplo.practicaUno.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ESTADISTICAS_PAGO")
public class EstadisticasPagos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PAGO")
	private Long idEstadistica;
	
	@Column(name = "FECHA_PAGO")
	private Date fechaPago;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
	private Persona persona;

	public Long getIdEstadistica() {
		return idEstadistica;
	}

	public void setIdEstadistica(Long idEstadistica) {
		this.idEstadistica = idEstadistica;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
