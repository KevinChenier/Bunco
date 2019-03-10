package framework;

/**
 * Un collection d'objet de type generique.
 * @author Kevin Chenier
 *
 * @param <T>
 */
public class CollectionList<T> implements Iterable<T> {
	// Type generique
    private T[] elements;
    // Grandeur courante de la collection.
    private int size;
    
    @SuppressWarnings("unchecked")
	public CollectionList() {
        this.elements = (T[]) new Object[0];
        size = 0;
    }

    /**
     * Methode qui retourne l'objet situe a index.
     *
     * @param index, int qui represente l'index.
     * @return elements, object qui represente un objet a un index.
     */
    public T get(int index) throws IndexOutOfBoundsException{
        if (index > size || index < 0) {
        	throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return elements[index];
    }
    
    /**
     * Used to get the first element in the collection
     * @return
     */
    public T getFirst() {
    	return this.get(0);
    }
    
    /**
     * Used to get the first element in the collection
     * @return
     */
    public T getLast() {
    	return this.get(this.size - 1);
    }

    /**
     * Methode qui permet d'ajouter un objet a la collection.
     *
     * @param object, object qui represente l'element qui est retourne a un index.
     */
    public void add(T object) {
    	// Incremente la grosseur de la collection
    	this.size++;
    	
    	// Cree un nouveau tableau temporaire contenant d'abord les elements de la collection, puis le nouvel objet.
        @SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Object[this.size];
     
        // Ajoute les elements au tableau temporaire
        for(int i = 0; i < this.elements.length; i++) {
        	tempArray[i] = this.elements[i];
        }
        
        // Ajoute l'objet passer en parametre au tableau temporaire
        tempArray[this.size - 1] = object;
        
        // Assigne les elements de la collection au tableau temporaire.
        this.elements = tempArray;
    }

    /**
     * Methode qui permet de savoir si la collection est vide.
     *
     * @return boolean, true si c'est vide.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Methode qui retourne la grandeur de la collection.
     *
     * @return int, un entier représentant le nombre d'élément
     */
    public int size() {
        return elements.length;
    }

    /**
     * Cette methode qui efface la collection courante et initialise une nouvelle.
     */
    @SuppressWarnings("unchecked")
	public void clear() {
        elements = (T[]) new Object[0];
    }

	@Override
	public Iterator<T> creerIterator() {
		return new CollectionIterator<T>(this.elements);
	}
	
	@Override
    public boolean equals(Object object) {
        boolean equals = false;
        if (object instanceof CollectionList) {
        	
            CollectionList<?> collectionList = (CollectionList<?>) object;
            
            // On verifie si les deux collections sont de meme grosseur.
            if (collectionList.size() == this.size()) {
            	
            	// Si les deux collections sont vides, alors les collections sont egaux.
                if (collectionList.size() == 0) {
                    equals = true;
                } else {
                	
                	for(int i = 0; i < this.size(); i++) {
                		equals = this.get(i).equals(collectionList.get(i));
                		
                		if(!equals)
                			break;
                	}
                }
            }
        }
        return equals;
    }

}
