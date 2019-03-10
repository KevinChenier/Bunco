package framework;

/**
 * Les classe qui en derive permettent de creer un iterateur.
 * @author Kevin Chenier
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * Determine si une liste detient encore un objet qui suit l'object courant.
	 * @return true s'il y a un objet suivant.
	 */
	public boolean hasNext();
	
	/**
	 * Methode qui retourne l'objet a la position courante et incremente la position ensuite.
	 * @return l'objet courant.
	 */
	public T next();
}
