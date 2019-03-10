package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bunco.*;
import framework.*;

/**
 * JUnit de test
 * Teste les points, les vainqueurs, l'initialisation d'un jeu, de joueurs et de des.
 * @author Kevin Chenier
 *
 */

class UnJeuTest {
	
	public UnJeu initJeu() {
		
		StrategieJeuBunco strategie = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strategie);
		
		return jeu;
	}
	
	@Test 
	public void getToursTest(){
		
		int tour = 0;
		UnJeu unJeu = initJeu();
		
		assertEquals(unJeu.getTourCourant(),tour);
	}
			
	@Test
	public void initDeTest() {
		assertNotNull(FabriqueDe.creerDes(JeuBunco.NOMBRE_FACES_DES, JeuBunco.NOMBRE_DES));
	}
	@Test
	public void initJoueur() {
		assertNotNull(FabriqueJoueur.creerJoueurs(JeuBunco.NOMBRE_JOUEURS));
	}
	
	@Test
	public void getListeDe() {
		
		UnJeu unJeu = initJeu();
		
		assertNotNull(unJeu.getListeDes());
	}
	
	@Test 
	public void getListeJoueur() {
		
		UnJeu unJeu = initJeu();
		
		assertNotNull(unJeu.getListeJoueurs());
	}
	
	@Test
	public void calculerLeVainceurTest(){
		
		StrategieJeuBunco strategie = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strategie);
		
		CollectionList<Joueur> listeJoueurs = jeu.getListeJoueurs();
		Joueur gagnantChoisit = listeJoueurs.getFirst();
		gagnantChoisit.setScore(8888);
		
		CollectionList<Joueur> calculGagnant = strategie.calculerLeVainqueur(jeu);
		int scoreCalculer = calculGagnant.getFirst().getScore();
		
		assertEquals(gagnantChoisit.getScore(),scoreCalculer);
	}
	
	@Test
	public void calculerPlusieursGagnantTest() {
		
		int leScoreGagnant = 8;
		StrategieJeuBunco strat = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strat);
		
		Iterator<Joueur> iter = jeu.getListeJoueurs().creerIterator();
		Joueur joueurEquals = null;
		
		while(iter.hasNext()) {
			joueurEquals = iter.next();
			joueurEquals.setScore(leScoreGagnant);
		}
		assertNotNull(strat.calculerLeVainqueur(jeu));
	}
	
	@Test
	public void calculLeVainceurAucunScore() {
		
		StrategieJeuBunco strat = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strat);
		
		strat.calculerLeVainqueur(jeu);
		
		assertNotNull(strat.calculerLeVainqueur(jeu));
	}
	
	
}
