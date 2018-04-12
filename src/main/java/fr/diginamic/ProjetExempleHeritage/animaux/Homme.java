package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Omnivore;
import fr.diginamic.ProjetHeritage.animal.Animal;

public class Homme extends Animal{


	public Homme(int age, float poids, int taille, String name) {
		super(age, poids, taille,name,new Omnivore());
	}
}
