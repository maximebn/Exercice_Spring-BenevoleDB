package com.formation.projet2.dto;

import java.util.List;

import com.formation.projet2.persistence.entity.Benevole;
import com.formation.projet2.persistence.entity.Cotisation;
import com.formation.projet2.persistence.entity.TypeBenevole;

public class BenevoleOne {
	
	private Long id;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	private String portable;
	private TypeBenevole type;
	private List<Cotisation> listeCotisation;
	
	public BenevoleOne() {
	}
	
	public BenevoleOne(Benevole b) {
		this.setId(b.getId());
		this.setNom(b.getNom());
		this.setPrenom(b.getPrenom());
		this.setMail(b.getMail());
		this.setTelephone(b.getTelephone());
		this.setPortable(b.getPortable());
		this.setType(b.getType());
		this.setListeCotisation(b.getListeCotisation());
	}
	
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