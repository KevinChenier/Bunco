package frameWork;
/**
 * 
 * 
 * @author laurent sieu , Kevin Chenie-Morales
 *
 */
public class Joueur implements Comparable<Joueur>{
	//Attributs
	private int numJoueur;
	//private String nom;
	private int scoreJoueur ;
	
	
	/**
	 * Constructeur de joueur
	 * @param numJoueur
	 */
	public Joueur(int numJoueur) {
		super();
		this.numJoueur = numJoueur;
		//this.nom = nom;
	}
	//Redifinition de equals
	@Override
	public boolean equals(Object obj) {
        boolean IsNotEquals = false;
        boolean equals = true;
        if (obj instanceof Joueur) {
            Joueur unJoueur = (Joueur) obj;
            if(unJoueur.getScore() == scoreJoueur && unJoueur.getNumJoueur() == numJoueur)
            {
            	return equals;
            }
        }
        return IsNotEquals;
    }
	//Redefiniition de compareTo
	@Override
	public int compareTo(Joueur unJoueur) {
		 if(this.getScore() == unJoueur.getScore()) {
			 return 0;
		 }
		 else if (this.getScore()<unJoueur.getScore()) {
			return -1;
		 }
		 else {return 1;
		 }
	}
	//Getteur et setter
	public int getNumJoueur() {
		return this.numJoueur;
	}
	public int getScore() {
		return this.scoreJoueur;
	}
	public void setNumJoueur(int numero) {
		this.numJoueur = numero;
	}
	public void setScore(int score) {
		this.scoreJoueur = score;
	}
	
	
}
