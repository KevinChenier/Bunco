package framework;

public interface MesStrategies {

	/**
	 * Calcule le score du joueur sur un tour, jusqu'au moment que le joueur pogne un bunco ou qu'il n'ait
	 * eu aucun point sur un tour.
	 * @param jeu, le jeu que le joueur joue.
	 * @param joueur, le joueur qui joue.
	 */
	public void calculerScoreTourJoueur(UnJeu jeu, Joueur joueur);
	
	/**
	 * Calculer le/les vainqueur(s) d'un jeu.
	 * @param jeu, le jeu que l'on veut calculer le/les vainqueur(s).
	 * @return la liste des vainqueurs.
	 */
	public CollectionList<Joueur> calculerLeVainqueur(UnJeu jeu);
}
