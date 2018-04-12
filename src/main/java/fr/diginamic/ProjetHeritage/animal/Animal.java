package fr.diginamic.ProjetHeritage.animal;

import javax.swing.GroupLayout.Alignment;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;
import fr.diginamic.ProjetExempleHeritage.Aliment.Viande;
import fr.diginamic.ProjetExempleHeritage.regime.Regime;

public abstract class Animal extends Viande {
	
	private int age;
	private float poids;
	private int taille; // taille en cm
	private Regime regime;
	private String name;
	

	
	public Animal(int age, float poids, int taille, String name,Regime regime) {
		super(name);
		setAge(age);
		setPoids(poids);
		setTaille(taille);
		setName(name);
		setRegime(regime);
	}

	
	
	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public Regime getregime() {
		return regime;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void deplacer() {
		System.out.println("je me deplace");
	}
	
	private void manger(Aliment aliment) {
		// TODO Auto-generated method stub

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	

}
