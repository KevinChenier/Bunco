package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import framework.Joueur;

import org.junit.*;
/**
 * JUnit de test
 * Teste les situations Null , egal , non egal , les attributs et leurs differences
 * Teste aussi les setters et les getters
 * @author laurent sieu 
 *
 */
class JoueurEtTeste {
	//Constantes
	final static int debut = 8;
	final static int fin = 8;
	
	/**
	 * whats is this 
	 */
	//@Test
	void test() {
		fail("Not yet implemented");
	}
	//Test Numero de joueurs
	@Test
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
	@Test
	public void getScoresJoueurTest() {
		int score = 8;
		Joueur personne = new Joueur(debut);
		personne.setScore(score);
		assertEquals(personne.getScore(),score);
	}
	//compareTo
	@Test
	public void compareToEgalTest() {
		int scorePareil = 11;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scorePareil);
		personne2.setScore(scorePareil);
		assertEquals(personne1.compareTo(personne2),0);
	}
	@Test
	public void compareToInferieurTest() {
		int scoreSup = 2;
		int scoreInf = 1;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scoreInf);
		personne2.setScore(scoreSup);
		assertEquals(-1,personne1.compareTo(personne2));
	}
	@Test
	public void compareToSuperieur() {
		int scoreSup = 3;
		int scoreInf = 2;
		Joueur personne1 = new Joueur(1);
		Joueur personne2 = new Joueur(2);
		personne1.setScore(scoreInf);
		personne2.setScore(scoreSup);
		assertEquals(1,personne2.compareTo(personne1));
	}
	@Test
	public void estEgal() {
		Joueur j1= new Joueur(1);
		Joueur j2= new Joueur(2);
		j1.setScore(8);
		j2.setScore(8);
		assertEquals(j1.getScore(),j2.getScore());
	}
	
	//Tester null
	@Test
	public void estNonNull() {
	Joueur j1= new Joueur(1);
	j1.setScore(8);
	assertNotNull(j1);
	}
	
}
