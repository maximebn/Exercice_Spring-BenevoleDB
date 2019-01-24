package com.formation.projet2.persistence.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cotisation")
public class Cotisation {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private long id;
	
	@Column (name = "IDBenevole", unique =true, nullable=false)
	private long idBenevole;
	
	@Column(name = "Montant", nullable = false)
	private double montant;
	
	@Column(name = "DateCotisation", nullable = false)
	private Date dateCotisation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdBenevole() {
		return idBenevole;
	}

	public void setIdBenevole(long idBenevole) {
		this.idBenevole = idBenevole;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateCotisation() {
		return dateCotisation;
	}

	public void setDateCotisation(Date dateCotisation) {
		this.dateCotisation = dateCotisation;
	}
	
	
}
