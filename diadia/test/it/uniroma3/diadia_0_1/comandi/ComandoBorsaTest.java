package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.Partita;



import org.junit.Before;
import org.junit.Test;

public class ComandoBorsaTest {

	private Partita game;
	private ComandoBorsa comB;
	
	
	@Before
	public void setUp() throws Exception {	
		this.game = new Partita();
		this.comB = new ComandoBorsa();	
		
		
	}

	@Test
	public void testEsegui() {
		this.comB.esegui(game);
	}

}
