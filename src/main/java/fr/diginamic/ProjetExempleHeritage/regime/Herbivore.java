package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;
import fr.diginamic.ProjetExempleHeritage.Aliment.Plante;

public class Herbivore extends Regime {

	public Herbivore() {
		super();
	}

	public void manger(Plante aliment) {
		if(!aliment.getViande()) {
			System.out.println("j'ai mangé "+ aliment.getNom());
		}else {
			System.out.println(" je ne peux pas manger ça ! Je ne veux pas manger ça !");
		}
		
	}
	

	
	
	
}
