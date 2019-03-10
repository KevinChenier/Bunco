package Bunco;

import framework.*;

public class FabriqueJeuBunco extends FabriqueJeu {

	@Override
	public UnJeu creerJeu(MesStrategies strategie) {
		return new JeuBunco(strategie);
	}

}
