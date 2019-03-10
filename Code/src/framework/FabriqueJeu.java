package framework;

/**
 * Classe abstraite qui permet de creer un jeu.
 * @author Kevin
 *
 */
public abstract class FabriqueJeu {

    protected FabriqueJeu() { }

    /**
     * Cree un jeu.
     * @param strategie Strategie du jeu.
     * @return Le jeu cree.
	 */
    public abstract UnJeu creerJeu(MesStrategies strategie);
}
