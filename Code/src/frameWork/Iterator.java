package frameWork;

public interface Iterator<T> {
	/**
	 * Determine si une liste detient encore un objet qui suit l'object courant.
	 * @return true s'il y a un objet suivant.
	 */
	public boolean hasNext();
	
	/**
	 * Methode qui retourne l'objet qui suit l'objet courant.
	 * @return l'objet suivant.
	 */
	public T next();
}
