package framework;

public class CollectionIterator<T> implements Iterator<T> {

	private T[] elements;
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

     public boolean hasNext() {
    	 if(index >= elements.length || elements[index] == null) {
    		 return false;
    	 } else {
    		 return true;
    	 }
     }
	 
}
