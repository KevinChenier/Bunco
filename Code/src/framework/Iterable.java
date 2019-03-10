package framework;

public interface Iterable<T> {
	/**
	 * Cree un iterateur pour une liste.
	 * @return
	 */
	Iterator<T> creerIterator();
}
