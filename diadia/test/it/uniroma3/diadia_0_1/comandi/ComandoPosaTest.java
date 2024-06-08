package it.uniroma3.diadia_0_1.comandi;
import it.uniroma3.diadia_0_1.*;
import it.uniroma3.diadia_0_1.ambienti.Stanza;
import it.uniroma3.diadia_0_1.attrezzi.*;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComandoPosaTest {
	private Partita game;
	private Attrezzo attr;
	private ComandoPosa comPo;
	private Stanza stanzaCorrente;
	
	
	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.attr = new Attrezzo("Spadino",1);
		this.comPo = new ComandoPosa();
		this.stanzaCorrente = new Stanza("Stanza dell'Oro");
		this.game.getLabirinto().setStanzaCorrente(stanzaCorrente);
		this.game.getGiocatore().getBorsa().addAttrezzo(attr);
		
	}

	@Test
	public void testEsegui() {
		assertFalse(this.game.getGiocatore().getBorsa().isEmpty());
		assertTrue(this.game.getLabirinto().getStanzaCorrente().isEmpty());
		
		this.comPo.setParametro("Spadino");
		this.comPo.esegui(game);
		
		assertTrue(this.game.getGiocatore().getBorsa().isEmpty());
		assertFalse(this.game.getLabirinto().getStanzaCorrente().isEmpty());
		assertSame(attr,this.game.getLabirinto().getStanzaCorrente().getAttrezzo("Spadino"));
		

		
	}

}
