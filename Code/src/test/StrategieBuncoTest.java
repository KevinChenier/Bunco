package test;

import framework.*;
import bunco.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit de test
 * Teste les calculs de vainqueurs, des points et la maintenance des joueurs.
 * @author Kevin Chenier 
 *
 */
public class StrategieBuncoTest {

    private CollectionList<Joueur> listeJoueurs;
    private CollectionList<De> listeDes;
    private JeuBunco jeu;
    private StrategieJeuBunco strategieBunco;

    @Before
    public void partieATester() throws Exception {
    	
        strategieBunco = new StrategieJeuBunco();
        jeu = new JeuBunco(strategieBunco);
        
        listeJoueurs = jeu.getListeJoueurs();
        listeDes = jeu.getListeDes();
        
        jeu.jouerPartie();
    }
    
    @Test
    public void calculerScoreTourTroisEgauxAuTourCourant() throws Exception {
    	
        partieATester();
        
        while (jeu.getTourCourant() < JeuBunco.NOMBRE_TOURS) {
        	
            for (int i = 0; i < listeDes.size(); i++) {
                listeDes.get(i).setValeur(jeu.getTourCourant() + 1);
            }
            assertEquals(JeuBunco.SCORE_TROIS_PAREILS, strategieBunco.calculerScoreTour(jeu));
        }
    }

    @Test
    public void calculerScoreTourBunco() throws Exception {
    	
        partieATester();
        
        while (jeu.getTourCourant() < JeuBunco.NOMBRE_TOURS) {
        	
            for (int i = 0; i < listeDes.size(); i++) {
                listeDes.get(i).setValeur(jeu.getTourCourant());
            }
            assertEquals(JeuBunco.SCORE_BUNCO, strategieBunco.calculerScoreTour(jeu));
        }
    }

    @Test
    public void calculerScoreTourDeuxEgauxAuTourCourant() throws Exception {
    	
        partieATester();
        
        while (jeu.getTourCourant() < JeuBunco.NOMBRE_TOURS) {
        	
            for (int i = 0; i < 2; i++) {
                listeDes.get(i).setValeur(jeu.getTourCourant() + 1);
            }
            assertEquals(2, strategieBunco.calculerScoreTour(jeu));
        }
    }

    @Test
    public void calculerScoreTourUnEgalAuTourCourant() throws Exception {
    	
        partieATester();
        
        while (jeu.getTourCourant() < JeuBunco.NOMBRE_TOURS) {
        	
            for (int i = 0; i < 1; i++) {
                listeDes.get(i).setValeur(jeu.getTourCourant() + 1);
            }
            assertEquals(1, strategieBunco.calculerScoreTour(jeu));
        }
    }

    @Test
    public void calculerScoreAucunPoint() throws Exception {
    	
        partieATester();
        
        while (jeu.getTourCourant() < JeuBunco.NOMBRE_TOURS) {
        	
            for (int i = 0; i < listeDes.size(); i++) {
                listeDes.get(i).setValeur(jeu.getTourCourant() + 2);
            }
            assertEquals(0, strategieBunco.calculerScoreTour(jeu));
        }
    }

    @Test
    public void calculerVainqueurUnSeulVainqueur() throws Exception {
    	
        partieATester();
        
        CollectionList<Joueur> listeVainqueurs = new CollectionList<>();
        
        for (int i = 0; i < listeJoueurs.size(); i++) {
            listeJoueurs.get(i).setScore(1);
        }
        listeJoueurs.getFirst().setScore(2);
        
        listeVainqueurs.add(listeJoueurs.getFirst());
        
        assertEquals(listeVainqueurs, strategieBunco.calculerLeVainqueur(jeu));
    }

    @Test
    public void calculerLeVainqueurDeuxVainqueurs() throws Exception {
    	
        partieATester();
        
        for (int i = 1; i <= JeuBunco.NOMBRE_JOUEURS; i++) {
            calculerVainqueurSelonXVainqueurs(i);
        }
    }

    @Test
    public void calculerLeVainqueurTousAZero() throws Exception {
    	
        partieATester();
        
        CollectionList<Joueur> listeVainqueurs = new CollectionList<>();
        
        for (int i = 0; i < listeJoueurs.size(); i++) {
        	
            listeJoueurs.get(i).setScore(0);
            listeVainqueurs.add(listeJoueurs.get(i));
        }
        assertEquals(listeVainqueurs, strategieBunco.calculerLeVainqueur(jeu));
    }
    
    /**
     * Calcul de X vainqueurs.
     * @param XVainqueurs, le nombre de vainqueurs.
     */
    private void calculerVainqueurSelonXVainqueurs(int XVainqueurs) {
    	
        CollectionList<Joueur> listeVainqueurs = new CollectionList<>();
        
        for (int i = 0; i < listeJoueurs.size(); i++) {
            listeJoueurs.get(i).setScore(0);
        }
        
        for (int i = 0; i < XVainqueurs; i++) {
            listeJoueurs.get(i).setScore(2);
            listeVainqueurs.add(listeJoueurs.get(i));
        }
        assertEquals(listeVainqueurs, strategieBunco.calculerLeVainqueur(jeu));
    }

}