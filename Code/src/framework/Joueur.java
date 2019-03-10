package framework;
/**
 * 
 * 
 * @author laurent sieu , Kevin Chenier
 *
 */
public class Joueur implements Comparable<Joueur>{
	
	// Numero du joueur.
	private int numero;
	
	// Score du joueur.
	private int score ;
	
	public Joueur(int numJoueur) {
		this.numero = numJoueur;
	}
	
	/**
	 * Retourne le numero du joueur.
	 * @return numero.
	 */
	public int getNumeroJoueur() {
		return this.numero;
	}
	
	/**
	 * Retourn le score du joueur.
	 * @return score.
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * Set le numero du joueur.
	 * @param numero
	 */
	public void setNumeroJoueur(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Set le score du joueur.
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public boolean equals(Object obj) {

        if (obj instanceof Joueur) {
        	
            Joueur unJoueur = (Joueur) obj;
            
            if(unJoueur.getScore() == this.score && unJoueur.getNumeroJoueur() == this.numero)
            {
            	return true;
            } else {
            	return false;
            }
        } else {
        	return false;
        }
    }

	@Override
	public int compareTo(Joueur unJoueur) {
		 if(this.getScore() == unJoueur.getScore()) {
			 return 0;
		 }
		 else if (this.getScore()<unJoueur.getScore()) {
			return -1;
		 }
		 else {
			 return 1;
		 }
	}	
}
