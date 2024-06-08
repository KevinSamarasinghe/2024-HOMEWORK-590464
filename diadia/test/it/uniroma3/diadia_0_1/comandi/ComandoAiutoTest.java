package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.Partita;

import org.junit.Before;
import org.junit.Test;

public class ComandoAiutoTest {
	private Partita game;
	private ComandoAiuto comA;
	
	@Before
	public void setUp() throws Exception {
	this.game = new Partita();
	this.comA = new ComandoAiuto();
	}

	@Test
	public void testEsegui() {
		this.comA.esegui(game);
	}

}
