package srategy.game.personnages;

import srategy.game.comportement.ComportementArcEtFleche;

public class Reine extends Personnage{

	public Reine() {
		this.comportementArme=new ComportementArcEtFleche();
	}

	@Override
	public void combattre() {
		score++;
	System.out.println("Je suis une Reine ....");
	this.comportementArme.utiliserArme();
		
	}

}
