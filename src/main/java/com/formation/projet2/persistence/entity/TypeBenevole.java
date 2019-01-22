package com.formation.projet2.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typebenevole")

public class TypeBenevole {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;

	@Column (name = "LibelleCourt", length=50, nullable=false)
	private String libelle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
