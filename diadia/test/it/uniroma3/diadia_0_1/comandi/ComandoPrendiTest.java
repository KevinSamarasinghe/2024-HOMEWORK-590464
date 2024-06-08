package it.uniroma3.diadia_0_1.comandi;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.Partita;
import it.uniroma3.diadia_0_1.ambienti.Stanza;
import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class ComandoPrendiTest {
	private Partita game;
	private Attrezzo attr;
	private ComandoPrendi comPr;
	private Stanza stanzaCorrente;
	
	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.attr = new Attrezzo("Spadino",1);
		this.comPr = new ComandoPrendi();
		this.stanzaCorrente = new Stanza("Stanza dell'Oro");
		this.game.getLabirinto().setStanzaCorrente(stanzaCorrente);
		this.stanzaCorrente.addAttrezzo(attr);
	}

	@Test
	public void testEsegui() {
		assertTrue(this.game.getGiocatore().getBorsa().isEmpty());
		assertFalse(this.game.getLabirinto().getStanzaCorrente().isEmpty());
		
		this.comPr.setParametro("Spadino");
		this.comPr.esegui(game);
		
		assertFalse(this.game.getGiocatore().getBorsa().isEmpty());
		assertTrue(this.game.getLabirinto().getStanzaCorrente().isEmpty());
		assertSame(attr,this.game.getGiocatore().getBorsa().getAttrezzo("Spadino"));
	}

}
