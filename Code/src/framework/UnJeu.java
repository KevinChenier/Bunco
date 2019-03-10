package framework;

public abstract class UnJeu {

	// Strategie a utiliser lors dun jeu.
	private MesStrategies strategie;
	
	// Le tour de la partie.
	private int tour= 0 ;
	
	// La collection de dees.
	private CollectionList<De> listeDes;
	
	// La collection de joueurs
	private CollectionList<Joueur> listeJoueurs;
	
	public UnJeu(MesStrategies strategie) {
		this.strategie = strategie;
		initPartie();
	}
	
	/**
	 * Initialise la partie.
	 */
	public void initPartie() {
		this.listeDes = this.initialiserDes();
		this.listeJoueurs = this.initialiserJoueurs();
	}
	
	/**
     * Joue la partie jusqu'a temps que l'on atteigne le nombre maximum de tours.
     */
    public void jouerPartie() {
    	
        System.out.println("Nombre de joueurs: " + listeJoueurs.size() + " , Nombre de tours: " + this.getNombreTours() + " , Nombre de des: " + listeDes.size());
        
        while (this.tour++ < this.getNombreTours()) {
        	
            Iterator<Joueur> iterateurJoueur = this.listeJoueurs.creerIterator();
            
            while (iterateurJoueur.hasNext()) {
                strategie.calculerScoreTourJoueur(this, iterateurJoueur.next());
            }
        }

        System.out.println();

        for (int i = 0; i < listeJoueurs.size(); i++) {
            System.out.println("Score final: Joueur: " + listeJoueurs.get(i).getNumeroJoueur() +  ", Score: " + listeJoueurs.get(i).getScore());
        }
        
        this.calculerLeVainqueur();
    }
	
	/**
	 * Initialise les joueurs du jeu.
	 * @return La collection de joueurs.
	 */
	protected abstract CollectionList<Joueur> initialiserJoueurs();

	/**
	 * Initialise les des du jeu.
	 * @return La collection de des.
	 */
	protected abstract CollectionList<De> initialiserDes();
	
	/**
	 * Retourne le nombre de tours max que le jeu fait.
	 * @return tour.
	 */
	protected abstract int getNombreTours(); 
	
	/**
     * Calcule le vainqueur.
     */
    public void calculerLeVainqueur() {
        strategie.calculerLeVainqueur(this);
    }

    /**
     * Retourne la liste des joueurs.
     *
     * @return La liste des joueurs.
     */
    public CollectionList<Joueur> getListeJoueurs() {
        return listeJoueurs;
    }

    /**
     * Retourne la liste des des.
     *
     * @return La liste des des.
     */
    public CollectionList<De> getListeDes() {
        return listeDes;
    }
	
	/**
	 * Retourne le nombre de tour courant.
	 * @return tour.
	 */
	public int getTourCourant() {
		return tour;
	}
}	

