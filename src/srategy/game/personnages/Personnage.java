package srategy.game.personnages;

import srategy.game.comportement.ComportementArme;

public abstract class Personnage {
protected String nom;
protected int score;
protected ComportementArme comportementArme;
public abstract void combattre();
public void setComportementArme(ComportementArme comportementArme) {
	this.comportementArme = comportementArme;
}

}
