package com.formation.projet2.dto;

import java.util.List;

import com.formation.projet2.persistence.entity.Benevole;
import com.formation.projet2.persistence.entity.Cotisation;

public class BenevoleLight {

		private Long id;
		private String nom;
		private String prenom;
		private String libelle;
		private double montantCotisation;
		
		public BenevoleLight() {
		}

		public BenevoleLight(Benevole b) {
			this.setId(b.getId());
			this.setNom(b.getNom());
			this.setPrenom(b.getPrenom());
			this.setLibelle(b.getType().getLibelle());
			this.setMontantCotisation(this.calculMontantCotisation(b.getListeCotisation()));
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
		
		public double getMontantCotisation() {
			return montantCotisation;
		}

		public void setMontantCotisation(double montantCotisation) {
			this.montantCotisation = montantCotisation;
		}
		
		public double calculMontantCotisation(List<Cotisation> listeCotisation) {
			double montantCotisation =0;
			for(Cotisation lc : listeCotisation) {
				montantCotisation += lc.getMontant();
			}
			return montantCotisation;
		}
}