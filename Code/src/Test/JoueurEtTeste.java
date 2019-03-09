package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frameWork.Joueur;

import org.junit.*;
class JoueurEtTeste {
	//Constantes
	final static int debut = 8;
	final static int fin = 8;
	
	/**
	 * whats is this 
	 */
	@Test
	void test() {
		fail("Not yet implemented");
	}
	//Teste Constructeur
	public void NumeroJoueursTeste() {
		int valeurJoueur = 888;
		Joueur personne = new Joueur (888);
		assertEquals(valeurJoueur,personne.getNumJoueur());
	}
	//Teste set num
	@Test
	public void LeSetNumJoueurTest() {
		Joueur personne = new Joueur(debut);
		personne.setNumJoueur(fin);
		assertEquals(fin,personne.getNumJoueur());
	}
	//Teste get num
	@Test
	public void testerLeGetNumJoueur() {
		Joueur personne = new Joueur(debut);
		int unChiffre = personne.getNumJoueur();
		assertEquals(debut,unChiffre);
	}
	//TODO FONCTIONNALITE DE BASE APPEL NORMAL ET TYPIQUE ?
	
	//Tester les cas limites
	
}
