package fr.diginamic.ProjetExempleHeritage.regime;

import javax.naming.ldap.ManageReferralControl;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;

public abstract class Regime {

	private String regime;
	
	public Regime() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void manger(Aliment aliment) throws Exception {
		throw new Exception();
	}/* {
	}
		System.out.println("j'ai manger "+ aliment.getNom());
	}*/
	
	
	
}
