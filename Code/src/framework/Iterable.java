package framework;

/**
 * Les classes qui en derive sont iterable.
 * @author Kevin Chenier
 *
 * @param <T>
 */
public interface Iterable<T> {
	/**
	 * Cree un iterateur pour une liste.
	 * @return
	 */
	Iterator<T> creerIterator();
}
