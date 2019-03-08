package frameWork;

public abstract class Collection<T> {
	//Type generique
    private T[] elements;
    // Grandeur courante de la collection.
    private int size;
    
    public Collection() {
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
     * Methode qui permet d'ajouter un objet a la collection.
     *
     * @param object, object qui represente l'element qui est retourne a un index.
     */
    public void add(T object) {
    	//Increment the size of the collection.
    	this.size++;
    	
    	//Create a new temporary array that will first contain the elements currently in the collection, then the new object.
        T[] tempArray = (T[]) new Object[this.size];
     
        //Add the current elements into the tempArray.
        for(int i = 0; i < this.elements.length; i++) {
        	tempArray[i] = this.elements[i];
        }
        
        //Add the object in the last index.
        tempArray[this.size - 1] = object;
        
        //Reference the new tempArray to the current elements in the collection.
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
    public void clear() {
        elements = (T[]) new Object[0];
    }

}
