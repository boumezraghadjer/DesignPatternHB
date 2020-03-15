package srategy.game.comportement;

import srategy.game.personnages.Personnage;
import srategy.game.personnages.Reine;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Personnage reine = new Reine();
reine.combattre();
reine.setComportementArme(new ComportementPoignard());
reine.combattre();

	}

}
