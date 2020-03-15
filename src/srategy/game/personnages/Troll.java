package srategy.game.personnages;

import srategy.game.comportement.ComportementHache;
import srategy.game.comportement.ComportementPoignard;

public class Troll extends Personnage{

	public Troll() {
		this.comportementArme=new ComportementPoignard();
	}

	@Override
	public void combattre() {
	System.out.println("Je suis un Troll ....");
	this.comportementArme.utiliserArme();
		
	}

}
