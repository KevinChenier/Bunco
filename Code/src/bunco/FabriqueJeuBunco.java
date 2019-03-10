package bunco;

import framework.*;

/**
 * Fabrique utilise pour le jeu Bunco.
 * @author Kevin Chenier
 *
 */
public class FabriqueJeuBunco extends FabriqueJeu {

	@Override
	public UnJeu creerJeu(MesStrategies strategie) {
		return new JeuBunco(strategie);
	}

}
