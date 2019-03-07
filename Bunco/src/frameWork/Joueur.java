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
	private String nom;
	private int scoreJoueur ;
	
	public Joueur(int numJoueur, String nom) {
		super();
		this.numJoueur = numJoueur;
		this.nom = nom;
	}
	@Override
	public int compareTo(Joueur o) {
		
		return 0;
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