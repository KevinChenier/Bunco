package framework;

/**
 * Classe utilisee pour creer l'iterateur d'une collection.
 * @author Kevin Chenier
 *
 * @param <T>
 */
public class CollectionIterator<T> implements Iterator<T> {
	// Les elements de la collection.
	private T[] elements;
	// L'index courant de l'iterateur.
	private int index= 0;
	
	public CollectionIterator (T[] elements){
		this.elements = elements;		
	}
	
	 @Override
     public T next() {
		 T collectionElement = elements[index];
		 index++;
		 return collectionElement;
     }

	 @Override
     public boolean hasNext() {
    	 if(index >= elements.length || elements[index] == null) {
    		 return false;
    	 } else {
    		 return true;
    	 }
     }
	 
}
