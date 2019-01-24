package com.formation.projet2.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="benevole")

public class Benevole {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", unique = true, nullable = false)
	private Long id;

	@Column (name = "Nom", length=100, nullable=false)
	private String nom;

	@Column (name = "prenom", length=100, nullable=false)
	private String prenom;

	@Column (name = "mail", length=100, nullable=false)
	private String mail;

	@Column (name = "telephone", length=100, nullable=false)
	private String telephone;

	@Column (name = "portable", length=100, nullable=false)
	private String portable;
	
	@Column (name = "Login", length = 50)
	private String login;
	
	@Column (name = "Password", length = 50)
	private String password;

	@ManyToOne
	@JoinColumn(name="IDTypeBenevole", referencedColumnName="ID")
	private TypeBenevole type;
	
	@OneToMany
	@JoinColumn(name = "IDBenevole", referencedColumnName = "ID")
	private List<Cotisation> listeCotisation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPortable() {
		return portable;
	}

	public void setPortable(String portable) {
		this.portable = portable;
	}

	public TypeBenevole getType() {
		return type;
	}

	public void setType(TypeBenevole type) {
		this.type = type;
	}

	public List<Cotisation> getListeCotisation() {
		return listeCotisation;
	}

	public void setListeCotisation(List<Cotisation> listeCotisation) {
		this.listeCotisation = listeCotisation;
	}
}
