package dev.top.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String pseudo;
    private String prenom;
    private String nom;
    private String email;
    private String adresse;
    private Integer score;
    private String photo;

	public Collegue(String pseudo, String prenom, String nom, String adresse, Integer score, String photo) {
		super();
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.nom = nom;
		this.email = nom + "." + prenom + "@hotmail.fr";
		this.adresse = adresse;
		this.score = score;
		this.photo = photo;
	}


	public Collegue() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Integer getScore() {
		return score;
	}


	public void setScore(Integer score) {
		this.score = score;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
    
}
