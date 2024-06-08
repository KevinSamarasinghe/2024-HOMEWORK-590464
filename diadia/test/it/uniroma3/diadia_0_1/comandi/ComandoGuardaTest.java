package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComandoGuardaTest {
	private Partita game;
	private ComandoGuarda comG;
	
	
	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.comG = new ComandoGuarda();
	}

	@Test
	public void testEsegui() {
		this.comG.esegui(game);
	}

}
