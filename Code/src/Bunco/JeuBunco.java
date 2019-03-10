package Bunco;

import framework.*;

public class JeuBunco extends UnJeu{
	// Nombre de joueurs dans une partie.
    public static final int NOMBRE_JOUEURS = 5;
    // Nombre de tours dans une partie.
    private static final int NOMBRE_TOURS = 6;
    // Nombre de des dans la partie.
    public static final int NOMBRE_DES = 3;
    // Nombre de faces d'un de.
    public static final int NOMBRE_FACES_DES = 6;
    // Score lorsque les trois des sont pareils.
    public static final int SCORE_TROIS_PAREILS = 5;
    // Score lorsqu'il y a eu un Bunco.
    public static final int SCORE_BUNCO = 21;

	public JeuBunco(MesStrategies strategie) {
		super(strategie);
	}

	@Override
	protected CollectionList<Joueur> initialiserJoueurs() {
		return FabriqueJoueur.creerJoueurs(NOMBRE_JOUEURS);
	}

	@Override
	protected CollectionList<De> initialiserDes() {
		return FabriqueDe.creerDes(NOMBRE_FACES_DES, NOMBRE_DES);
	}

	@Override
	protected int getNombreTours() {
		return NOMBRE_TOURS;
	}

}
