package frameWork;

public class JoueurIterator implements Iterator {
	//Attributs
	CollectionJoueur [] listeJoueur;
	int positionJoueur;
	/**
	 * TODO
	 */
	@Override
	public boolean hasNext() {
		if(positionJoueur<listeJoueur.length ||listeJoueur[positionJoueur]==null ) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		CollectionJoueur collJoueur = listeJoueur[positionJoueur];
		positionJoueur= positionJoueur+1;
		return  collJoueur;
	}

}
