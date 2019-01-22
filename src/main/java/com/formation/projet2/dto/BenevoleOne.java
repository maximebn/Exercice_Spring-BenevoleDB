package com.formation.projet2.dto;

import com.formation.projet2.persistence.entity.TypeBenevole;

public class BenevoleOne {
	
	private Long id;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	private String portable;
	private TypeBenevole type;
	
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
	
	

}
