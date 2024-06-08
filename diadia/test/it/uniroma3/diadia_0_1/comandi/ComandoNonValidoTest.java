package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComandoNonValidoTest {
	private Partita game;
	private ComandoNonValido comNV;
	
	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.comNV = new ComandoNonValido();
	}

	@Test
	public void testEsegui() {
		this.comNV.esegui(game);
	}

}
