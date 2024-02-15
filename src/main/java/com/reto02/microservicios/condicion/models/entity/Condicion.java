package com.reto02.microservicios.condicion.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="condicion")
public class Condicion
{
	
	@Column(name = "IDCONDICION")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCondicion;
    
    @Column(name = "DESCCONDICION")
    private String descCondicion;
    
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @PrePersist
    public void prePersist() {
    	this.fechaRegistro = new Date();
    }

	public Long getIdCondicion() {
		return idCondicion;
	}

	public void setIdCondicion(Long idCondicion) {
		this.idCondicion = idCondicion;
	}

	public String getDescCondicion() {
		return descCondicion;
	}

	public void setDescCondicion(String descCondicion) {
		this.descCondicion = descCondicion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
    
    

}

