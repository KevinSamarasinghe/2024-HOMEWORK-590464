package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.*;

import org.junit.Before;
import org.junit.Test;

public class ComandoFineTest {
	private Partita game;
	private ComandoFine comF;
	
	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.comF = new ComandoFine();
	}

	@Test
	public void testEsegui() {
		this.comF.esegui(game);
	}

}
