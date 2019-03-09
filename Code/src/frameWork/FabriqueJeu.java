package frameWork;

public abstract class FabriqueJeu {

    protected FabriqueJeu() { }

    /**
     * Cree un jeu.
     * @param strategie Strategie du jeu.
     * @return Le jeu cree.
	 */
    public abstract UnJeu creerJeu(MesStrategies strategie);
}
