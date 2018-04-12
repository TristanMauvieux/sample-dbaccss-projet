package fr.diginamic.ProjetExempleHeritage.Aliment;

public abstract class Aliment {
	private String nom;
	private Boolean viande;
	
	public Aliment() {
		// TODO Auto-generated constructor stub
	}
	
	public Aliment(String nom, Boolean viande) {
		this.nom = nom;
		this.viande = viande;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getViande() {
		return viande;
	}

	private void setViande(Boolean viande) {
		this.viande = viande;
	}
	
	
	
	

}
