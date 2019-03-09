package frameWork;

public interface MesStrategies {

	public void calculerScoreTour(Joueur joueur, CollectionList<De> listeDes, int tourCourant);
	
	public CollectionList<Joueur> calculerLeVainqueur(CollectionList<Joueur> listeJoueurs);
}
