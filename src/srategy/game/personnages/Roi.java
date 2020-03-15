package srategy.game.personnages;

import srategy.game.comportement.ComportementArcEtFleche;
import srategy.game.comportement.ComportementHache;

public class Roi extends Personnage{

	public Roi() {
		this.comportementArme=new ComportementHache();
	}

	@Override
	public void combattre() {
	System.out.println("Je suis un Roi ....");
	this.comportementArme.utiliserArme();
		
	}


}
