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
	@Override
	public int compareTo(De arg0) {
		return 0;
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
