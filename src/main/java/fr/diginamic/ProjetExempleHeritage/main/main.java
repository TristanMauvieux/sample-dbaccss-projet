package fr.diginamic.ProjetExempleHeritage.main;

import fr.diginamic.ProjetExempleHeritage.Aliment.Plante;
import fr.diginamic.ProjetExempleHeritage.Aliment.Viande;
import fr.diginamic.ProjetExempleHeritage.animaux.Homme;
import fr.diginamic.ProjetExempleHeritage.animaux.Lapin;
import fr.diginamic.ProjetExempleHeritage.animaux.Lion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lapin bunny = new Lapin(10, 12, 10,"bunny");
		Lion henry = new Lion(30, 500, 60, "henry");
		Homme philipe = new Homme(45, 70, 187, "philipe");
		
		
		Plante carotte = new Plante("carotte");
		Viande steak = new Viande("steak");
		
		try {
			bunny.getregime().manger(steak);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bunny.getregime().manger(carotte);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			henry.getregime().manger(steak);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			henry.getregime().manger(carotte);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			henry.getregime().manger(bunny);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			henry.getregime().manger(philipe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
