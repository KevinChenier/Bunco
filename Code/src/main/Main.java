package main;

import bunco.*;
import framework.*;

public class Main {

	public static void main(String[] args) {
		FabriqueJeu fabriqueJeu = new FabriqueJeuBunco();
        UnJeu jeu = fabriqueJeu.creerJeu(new StrategieJeuBunco());

        jeu.jouerPartie();
	}
}
