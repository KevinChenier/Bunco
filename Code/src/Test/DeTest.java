package Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import frameWork.De;;
/**
 * JUnit de test
 * Teste les situations Null , egal , non egal , les attributs et leurs differences
 * Teste aussi le lancer de de et les valeurs sorties de ce lancer.
 * @author laurent sieu 
 *
 */
public class DeTest {
	//Test de valeurs
	final int facesDe = 3;
	@Before
	public void valeurDeATester() throws Exception {
		int facesDe = 3;
		De unDe = new De(facesDe);
		unDe.setValeur(0);
	}
	@Test
	public void estDifferent() throws Exception {
		De unDe1 = new De(3);
		De unDe2 = new De(3);
		unDe1.setValeur(1);
		unDe2.setValeur(2);
		assertNotEquals(unDe1,unDe2);
	}
	@Test
	public void setDeTest() throws Exception {
		int uneValeur = 2 ;
		De unDe = new De(8);
		unDe.setValeur(uneValeur);
		assertEquals(uneValeur,unDe.getValeur());
	}
	
	@Test
	public void deSuperieurTest() throws Exception{
		De deInf = new De(8);
		De deSup = new De(8);
		deInf.setValeur(1);
		deSup.setValeur(6);
		assertEquals(deSup.compareTo(deInf),1);
	}

	@Test
	public void deInferieurTest() throws Exception{
		De deInf = new De(8);
		De deSup = new De(8);
		deInf.setValeur(1);
		deSup.setValeur(6);
		assertEquals(deInf.compareTo(deSup),-1);
	}

	@Test
	public void memeValeurDeTest() throws Exception{
		int memeValeur = 8;
		De deEq1 = new De(8);
		De deEq2 = new De(8);
		deEq1.setValeur(memeValeur);
		deEq2.setValeur(memeValeur);
		assertEquals(deEq1.compareTo(deEq2),0);
	}
	/*Kevin a gerer les exceptions de de. Je ne sais pas quoi faire. 
	 Test NULL*/
	@Test
	public void deNullTest() throws Exception{
		try {
		De de1 = new De(1);
		De de2 = new De(1);
		de1.setValeur(4);
		de2.setValeur(5);
		de1.compareTo(null);
		fail();
		}catch(Exception e) {
			System.out.println("N'est pas pareil.Fonctionelle");
		}
	}
	@Test
	public void estNonNullTest() throws Exception {
		De unDe = new De(8);
		unDe.setValeur(8);
		assertNotNull(unDe);
	}
	//Tester fonctions du de
	@Test
	public void lancerLeDeTest() {
		De unDe = new De(facesDe);
		int valeurTrouver = unDe.lancerDe();
		assertTrue(valeurTrouver<=facesDe && valeurTrouver>=1);
	}
	
}
