package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import framework.Joueur;


/**
 * JUnit de test
 * Teste les situations Null , egal , non egal , les attributs et leurs differences.
 * Teste aussi les setters et les getters.
 * @author Laurent Sieu 
 *
 */
class JoueurTest {

	private final static int debut = 8;
	private final static int fin = 8;
	
	void test() {
		fail("Not yet implemented");
	}

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
		Joueur joueur = new Joueur(debut);
		
		joueur.setScore(score);
		
		assertEquals(joueur.getScore(),score);
	}

	@Test
	public void compareToEgalTest() {
		
		int scorePareil = 11;
		Joueur joueur1 = new Joueur(1);
		Joueur joueur2 = new Joueur(2);
		
		joueur1.setScore(scorePareil);
		joueur2.setScore(scorePareil);
		
		assertEquals(joueur1.compareTo(joueur2),0);
	}
	@Test
	public void compareToInferieurTest() {
		
		int scoreSuperieur = 2;
		int scoreInferieur = 1;
		Joueur joueur1 = new Joueur(1);
		Joueur joueur2 = new Joueur(2);
		
		joueur1.setScore(scoreInferieur);
		joueur2.setScore(scoreSuperieur);
		
		assertEquals(-1,joueur1.compareTo(joueur2));
	}
	@Test
	public void compareToSuperieur() {
		
		int scoreSuperieur = 3;
		int scoreInferieur = 2;
		Joueur joueur1 = new Joueur(1);
		Joueur joueur2 = new Joueur(2);
		
		joueur1.setScore(scoreInferieur);
		joueur2.setScore(scoreSuperieur);
		
		assertEquals(1,joueur2.compareTo(joueur1));
	}
	@Test
	public void estEgal() {
		
		Joueur joueur1= new Joueur(1);
		Joueur joueur2= new Joueur(2);
		
		joueur1.setScore(8);
		joueur2.setScore(8);
		
		assertEquals(joueur1.getScore(),joueur2.getScore());
	}

	@Test
	public void estNonNull() {
		
	Joueur joueur1= new Joueur(1);
	
	joueur1.setScore(8);
	
	assertNotNull(joueur1);
	}
	
}
