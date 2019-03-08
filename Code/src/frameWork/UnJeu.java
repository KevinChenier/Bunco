package frameWork;

public abstract class UnJeu {
	//A T T R I B U T S
	//Strategie a utiliser lors dun jeu.
	private MesStrategies stratUtiliser;
	private int nbDeTours= 0 ;
	//Liste collection de et Joueur
	private CollectionDe laListeDeDe;
	private CollectionJoueur laListeDeJoueur;
	/**
	 * Constructeur dun jeu. Strategie requise. 
	 * @param stratUtiliser
	 */
	public UnJeu(MesStrategies stratUtiliser) {
		this.stratUtiliser = stratUtiliser;
		initUnePartie();
	}
	public void initUnePartie() {
		//I N C O M P L E T
	}
	
	//Getter setter
	public int getNbDeTours() {
		return nbDeTours;
	}
	public void setNbDeTours(int nbDeTours) {
		this.nbDeTours = nbDeTours;
	}
	
}	

