package com.formation.projet2.dto;

import com.formation.projet2.persistence.entity.Benevole;

public class BenevoleLight {

		private Long id;
		private String nom;
		private String prenom;
		private String libelle;
		
		public BenevoleLight() {
		}

		public BenevoleLight(Benevole b) {
			this.setId(b.getId());
			this.setNom(b.getNom());
			this.setPrenom(b.getPrenom());
			this.setLibelle(b.getType().getLibelle());
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
		public String getLibelle() {
			return libelle;
		}
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}		
}