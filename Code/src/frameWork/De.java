package frameWork;
import java.util.Random;
public class De implements Comparable<De> {
	//valeur random
	private static final Random chiffreAleatoire = new Random();
	//Attributs 
	private int nbFacesDe;
	private int valeurDes;
	
	public De(int nbFacesDe) {
		this.nbFacesDe = nbFacesDe;
		this.valeurDes = 0;
	}
	/**
	 * A T T E N T I O N P A S T E R M I N E R
	 */
	@Override
	public int compareTo(De unDe) {
		return this.getValeurDes() == unDe.getValeurDes() ? 0:-1 ;
	}
	//Getter setter
	public int getNbFacesDe() {
		return nbFacesDe;
	}
	public void setNbFacesDe(int nbFacesDe) {
		this.nbFacesDe = nbFacesDe;
	}
	public int getValeurDes() {
		return valeurDes;
	}
	public void setValeurDes(int valeurDes) {
		this.valeurDes = valeurDes;
	}
	
	
}
