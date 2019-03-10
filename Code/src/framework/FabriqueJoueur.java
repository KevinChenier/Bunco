package framework;

/**
 * Classe qui permet de creer une liste de joueurs.
 * @author Kevin Chenier
 *
 */
public class FabriqueJoueur {

	private FabriqueJoueur () { }

    /**
     * Cree une liste de joueurs
     * @param nombreJoueurs Nombre de joueurs.
     * @return Liste de joueurs.
     */
    public static CollectionList<Joueur> creerJoueurs(int nombreJoueurs) {
        CollectionList<Joueur> listeJoueurs = new CollectionList<Joueur>();

        for (int i = 0; i < nombreJoueurs; i++) {
            listeJoueurs.add(new Joueur(i+1));
        }

        return listeJoueurs;
    }
	
}
