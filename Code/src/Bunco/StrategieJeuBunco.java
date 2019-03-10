package Bunco;

import framework.*;

public class StrategieJeuBunco implements MesStrategies {

	public StrategieJeuBunco() { }

	/**
	 * Calcule le score d'un tour.
	 * @param jeu, le jeu que l'on veut calculer le tour.
	 * @return le score du tour.
	 */
	public int calculerScoreTour(UnJeu jeu) {
		
		int tourCourant = jeu.getTourCourant();
		int score = 0;

	        if (!jeu.getListeDes().isEmpty()) {
	        	
	            Iterator<De> iterateurDe = jeu.getListeDes().creerIterator();

	            while(iterateurDe.hasNext()) {
	            	// Si la valeur du de est egal au tour courant, alors il gagne un point.
	            	if(iterateurDe.next().getValeur() == tourCourant)
	            		score++;
	            	
	            	// Ca veut dire que tous les des sont egaux et que la valeur est aussi egal au tour courant, donc Bunco.
		            if(score == jeu.getListeDes().size())
		            	score = JeuBunco.SCORE_BUNCO;
	            }
	            
	            // Si aucun point n'a ete accumule, on verifie si tous les des sont egaux. Si ce n'est pas le cas,
	            // alors le joueur n'a pas atteint Bunco et n'a accumule aucun point.
	            if(score == 0) {
	            	
	            	iterateurDe = jeu.getListeDes().creerIterator();
	            	boolean tousEgaux = true;
	            	
	            	while(iterateurDe.hasNext()) {
	            		// Si le de courant est egal au premier de, alors les des sont egaux et on continue de verifier.
	            		if(iterateurDe.next().equals(jeu.getListeDes().getFirst()))
	            			continue;
	            		else {
	            			tousEgaux = false;
	            			break;
	            		}
	            	}
	            	if(tousEgaux) {
	            		score = JeuBunco.SCORE_TROIS_PAREILS;
	            	}
	            }
	        }
	        return score;
	}
	
	/**
	 * Calcule le score du joueur sur un tour, jusqu'au moment que le joueur pogne un Bunco ou qu'il n'ait
	 * eu aucun point sur un tour.
	 * @param jeu, le jeu que le joueur joue.
	 * @param joueur, le joueur qui joue.
	 */
	@Override
    public void calculerScoreTourJoueur(UnJeu jeu, Joueur joueur) {
    	
        System.out.println("\nTour : " + jeu.getTourCourant() + " pour le joueur " + joueur.getNumeroJoueur() + "\n");
        
        int scoreAccumule = joueur.getScore();
        int scoreCoup;
        
        // Rouler les des, calculer le score du coup et incrementer le score accumule, jusqu'à temps
        // que le joueur pogne un Bunco ou qu'il n'est pas eu de point (scoreCoup = 0).
        do {
			roulerDes(jeu.getListeDes());
            scoreCoup = calculerScoreTour(jeu);
            
            System.out.print("Score obtenu sur ce coup : " + scoreCoup +"\n");
            
            scoreAccumule += scoreCoup;
        } while (scoreCoup != 0 && scoreCoup != JeuBunco.SCORE_BUNCO);

        joueur.setScore(scoreAccumule);
        System.out.println("\nScore accumule du joueur " + joueur.getNumeroJoueur() +" au total: " + joueur.getScore());
    }

	@Override
	public CollectionList<Joueur> calculerLeVainqueur(UnJeu jeu) {
		
		CollectionList<Joueur> listeVainqueur = new CollectionList<Joueur>();
        Iterator<Joueur> iterateurJoueur = jeu.getListeJoueurs().creerIterator();
        
        while (iterateurJoueur.hasNext()) {

        	// On set en premier la premiere valeur de listeVainqueur en lui ajoutant le premier element de 
        	// la liste de joueur.
            if (listeVainqueur.size() == 0) {
                listeVainqueur.add(iterateurJoueur.next());
            } else {
                
                Joueur prochainJoueur = iterateurJoueur.next();
                
                // On compare le score entre les deux joueurs.
                switch (prochainJoueur.compareTo(listeVainqueur.getFirst())) {
	                // Si prochainJoueur a un score plus elever que le precedent on le met gagnant.
	                case 1:
	                	listeVainqueur = new CollectionList<>();
	                    listeVainqueur.add(prochainJoueur);
	                    break;
                    // Si prohainJoueur detient un score plus petit, alors il n'est pas gagnant.
                    case -1:
                        break;
                    // Si les score entre les deux joueurs sont pareils, on ajoute prochainJoueur à la liste.
                    case 0:
                        listeVainqueur.add(prochainJoueur);
                        break;
                }
            }
        }
        
        Iterator<Joueur> iterateurVainqueur = listeVainqueur.creerIterator();
        
        while(iterateurVainqueur.hasNext()) {
        	Joueur vainqueur = iterateurVainqueur.next();
        	System.out.println("Joueur gagnant: joueur " + vainqueur.getNumeroJoueur() + 
        			" avec un score de: " + vainqueur.getScore());
        }

        return listeVainqueur;
	}
	
	/**
	 * Rouler la liste de des et setter les valeurs aux des.
	 * @param listeDes
	 * @throws IndexOutOfBoundsException
	 * @throws Exception
	 */
	private void roulerDes(CollectionList<De> listeDes) {
		
        Iterator<De> iterateurDe = listeDes.creerIterator();

        while (iterateurDe.hasNext()) {
        	
        	De deCourant = iterateurDe.next();
            int valeurDe = deCourant.lancerDe();
            
            try {
				deCourant.setValeur(valeurDe);
			} catch (Exception e) {
				e.printStackTrace();
			}
            
            System.out.println("La valeur du de est: " + valeurDe);
        }
    }

}
