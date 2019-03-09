package Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import frameWork.De;;
public class DeTest {
	private De de1;
	private De de2;

	@Before
	public void faireAvant(){
		de1 = new De(6);
		de2 = new De(6);
	}

	@Test
	public void deSuperieurTest() throws Exception{
		de1.setValeur(4);
		de2.setValeur(5);
		assertTrue(de1.compareTo(de2)==1);
	}

	@Test
	public void deInferieurTest() throws Exception{
		de1.setValeur(4);
		de2.setValeur(5);
		assertTrue(de2.compareTo(de1)==-1);
	}

	@Test
	public void memeDeTest() throws Exception{
		de1.setValeur(4);
		assertTrue(de1.compareTo(de1)==0);
	}
	//Kevin a gerer les exceptions de de. Je ne sais pas quoi faire. 
	@Test
	public void deNullTest() throws Exception{
		try {
		de1.setValeur(4);
		de1.compareTo(null);
		fail();
		}catch(Exception e) {
			System.out.println("N'est pas pareil");
		}
	}


}
