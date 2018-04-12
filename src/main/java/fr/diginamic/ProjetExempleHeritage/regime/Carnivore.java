package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;

public class Carnivore extends Regime {

	public Carnivore() {
		super();
	}

	@Override
	public void manger(Aliment aliment) {
		if(aliment.getViande()) {
			System.out.println("j'ai mang� "+aliment.getNom());
		}
		else {
			System.out.println(" je ne peux pas manger �a ! Je ne veux pas manger �a !");
		}
	}
	

}
