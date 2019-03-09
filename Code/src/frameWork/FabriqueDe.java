package frameWork;

public class FabriqueDe {

	public FabriqueDe() { }

    /**
     * Cree une liste de des.
     * @param nombreFaces Nombre de faces du de.
     * @param nombreDes Nombre de des.
     * @return
     */
    public static CollectionList<De> creerDes(int nombreFaces, int nombreDes) {
    	
        CollectionList<De> listeDes = new CollectionList<De>();

        for (int i = 0; i < nombreDes; i++) {
            listeDes.add(new De(nombreFaces));
        }

        return listeDes;
    }
}
