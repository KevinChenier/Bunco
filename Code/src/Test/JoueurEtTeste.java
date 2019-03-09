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
	//Test Numero de joueurs
	public void NumeroJoueursTeste() {
		int valeurJoueur = 888;
		Joueur personne = new Joueur (888);
		assertEquals(valeurJoueur,personne.getNumeroJoueur());
	}
	@Test
	public void LeSetNumJoueurTest() {
		Joueur personne = new Joueur(debut);
		personne.setNumeroJoueur(fin);
		assertEquals(fin,personne.getNumeroJoueur());
	}
	@Test
	public void LeGetNumJoueurTest() {
		Joueur personne = new Joueur(debut);
		int unChiffre = personne.getNumeroJoueur();
		assertEquals(debut,unChiffre);
	}
	//Teste des scores
	@Test	
	public void scoresJoueurTest() {
		int score = 88;
		Joueur personne = new Joueur(debut);
		personne.setScore(score);
		assertEquals(joueur. )
	}
	//TODO FONCTIONNALITE DE BASE APPEL NORMAL ET TYPIQUE ?
	
	//TODO Tester les cas limites
	
	//Tester null
	
	
}
