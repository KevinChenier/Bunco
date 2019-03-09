package frameWork;

public class DeIterator implements Iterator{
	//Attributs
	CollectionList listeDe;
	int positionDe = 0;
	/**
	 * TODO(non-Javadoc)
	 * @see frameWork.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if(positionDe<listeDe.length ||listeDe[positionDe]==null ) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		CollectionList collDe = listeDe[positionDe];
		positionDe = positionDe + 1;
		return collDe;
	}

}
