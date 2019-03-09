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
	public void setScoresJoueurTest() {
		int score = 8;
		Joueur personne = new Joueur(debut);
		personne.setScore(score);
		assertEquals(personne.getScore(),score );	 
	}
	public void getScoresJoueurTest() {
		int score = 8;
		Joueur personne = new Joueur(debut);
		personne.setScore(score);
		assertEquals(personne.getScore(),score);
	}
	//compareTo
	public void compareToEgalTest() {
		int scorePareil = 11;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scorePareil);
		personne2.setScore(scorePareil);
		assertEquals(personne1.compareTo(personne2),0);
	}
	public void compareToInferieur() {
		int scoreSup = 2;
		int scoreInf = 1;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scoreInf);
		personne2.setScore(scoreSup);
		assertEquals(-1,personne1.compareTo(personne2));
	}
	public void compareToSuperieur() {
		int scoreSup = 3;
		int scoreInf = 2;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scoreInf);
		personne2.setScore(scoreSup);
		assertEquals(1,personne1.compareTo(personne2));
	}
	//TODO FONCTIONNALITE DE BASE APPEL NORMAL ET TYPIQUE ?
	
	//TODO Tester les cas limites
	
	//Tester null
	
	
}
