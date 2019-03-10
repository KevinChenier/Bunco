package Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Bunco.JeuBunco;
import Bunco.StrategieJeuBunco;
import framework.CollectionList;
import framework.FabriqueDe;
import framework.FabriqueJoueur;
import framework.Iterator;
import framework.Joueur;
import framework.MesStrategies;
import framework.UnJeu;

class UnJeuTest {
	//Constantes a reutiliser
	private final int NB_JOUEURS = 4;
	private final int NB_TOURS = 3;
	private final MesStrategies maStrategie = null;
	private final int NB_DES = 4;		
	private final int NB_FACES_DES = 6;
	//Init un jeu pour pouvoir tester
	public UnJeu initJeu() {
		StrategieJeuBunco strat = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strat);
		return jeu;
	}
	
	//Getter setter
	@Test 
	public void getToursTest(){
				int leTours = 0;
				UnJeu unJeu = initJeu();
				assertEquals(unJeu.getTourCourant(),leTours);
	}
			
	 // test fonctionnalites de base (appel normal et typique de la methode)
	@Test
	public void initDeTest() {
		assertNotNull(FabriqueDe.creerDes(NB_FACES_DES, NB_DES));
	}
	@Test
	public void initJoueur() {
		assertNotNull(FabriqueJoueur.creerJoueurs(NB_JOUEURS));
	}
	
	//Tester si null non null (avec getter)
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
	
	//Teste des calculs
	@Test
	public void calculerLeVainceurTest(){
		StrategieJeuBunco strat = new StrategieJeuBunco();
		JeuBunco jeu = new JeuBunco(strat);
		
		CollectionList<Joueur> maListeJoueur = jeu.getListeJoueurs();
		Joueur gagnantChoisit = maListeJoueur.get(0);
		gagnantChoisit.setScore(8888);
		
		CollectionList<Joueur> calculGagnant = strat.calculerLeVainqueur(jeu);
		int scoreCalculer = calculGagnant.get(0).getScore();
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
