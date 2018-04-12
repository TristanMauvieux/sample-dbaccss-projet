package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;
import fr.diginamic.ProjetHeritage.animal.Animal;

public class Omnivore extends Regime {

	public Omnivore() {
		super();
	}

	@Override
	public void manger(Aliment aliment) {
		System.out.println("j'ai mangé "+ aliment.getNom());
		
	}
	
	
}
