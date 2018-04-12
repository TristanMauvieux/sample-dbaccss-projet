package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Carnivore;
import fr.diginamic.ProjetHeritage.animal.Animal;

public class Hyene extends Animal {

	public Hyene(int age, float poids, int taille, String name) {
		super(age, poids, taille,name,new Carnivore());
	}

}
