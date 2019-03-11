package framework;
import java.util.Random;

/**
 * Classe qui permet de construire un de.
 * @author Kevin Chenier
 *
 */
public class De implements Comparable<De> {
	// Valeur random qui sert a rouler un de.
	private static final Random chiffreAleatoire = new Random();
	// Nombre de faces du de.
	private int nombreFaces;
	// Valeur du de a un moment.
	private int valeur = 0;
	
	public De(int nbFacesDe) {
		this.nombreFaces = nbFacesDe;
	}

    /**
     * Retourne un nombre aleatoire entre 1 et le nombre de faces.
     * @return Le nombre aleatoire
     */
    public int lancerDe() {
        return this.valeur = chiffreAleatoire.nextInt(this.getNbFaces()) + 1;
    }

    /**
     * Retourne la valeur du de.
     * @return Valeur du de
     */
    public int getValeur() {
        return this.valeur;
    }

    /**
     * Retourne le nombre de faces du de.
     * @return Nombre de faces du de
     */
    public int getNbFaces() {
        return this.nombreFaces;
    }

    /**
     * Set une valeur pour le de.
     * @param valeur Valeur à attribuer au dé
     */
    public void setValeur(int valeur) throws Exception {
    	if(valeur > this.getNbFaces() || valeur < 0)
    		System.err.println("Can't set value of De because value is bigger than nombreFaces or smaller than 0");
    	else
    		this.valeur = valeur;
    }
	
	@Override
	public int compareTo(De unDe) {
		
		if(this.getValeur() == unDe.getValeur()) {
			 return 0;
		 }
		 else if (this.getValeur() < unDe.getValeur()) {
			return -1;
		 }
		 else {
			 return 1;
		 }
	}	
	
	
	@Override
    public boolean equals(Object object) {

        if (object instanceof De) {
        	
            De de = (De) object;
            
            if(de.getNbFaces() == this.nombreFaces && de.getValeur() == this.valeur) {
            	return true;
            }
            else {
            	return false;
            }
        } else {
        	return false;
        }
    }
}
