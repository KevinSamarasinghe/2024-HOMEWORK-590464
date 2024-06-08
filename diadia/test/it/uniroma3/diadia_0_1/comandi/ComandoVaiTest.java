package it.uniroma3.diadia_0_1.comandi;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.Partita;
import it.uniroma3.diadia_0_1.ambienti.Stanza;

import org.junit.Before;
import org.junit.Test;

public class ComandoVaiTest {
	private Partita game;
	private Stanza stanzaDoveAnd;
	private Stanza stanzaAttuale;
	private ComandoVai comV;

	@Before
	public void setUp() throws Exception {
		this.game = new Partita();
		this.comV = new ComandoVai();
		this.stanzaAttuale = new Stanza("Ingresso");
		this.stanzaDoveAnd = new Stanza("Soggiorno");
		this.game.getLabirinto().setStanzaCorrente(stanzaAttuale);
		this.game.getLabirinto().getStanzaCorrente().impostaUscita("est", stanzaDoveAnd);
	}

	@Test
	public void testEseguiDirezioneNulla() {
		this.comV.setParametro(null);
		this.comV.esegui(this.game);
		assertSame(this.stanzaAttuale, this.game.getLabirinto().getStanzaCorrente() );
	
	}
	
	@Test
	public void testEseguiDirezioneInesistente() {
		this.comV.setParametro("nord");
		this.comV.esegui(this.game);
		assertSame(this.stanzaAttuale, this.game.getLabirinto().getStanzaCorrente() );
	}
	
	@Test
	public void testEsegui() {
		this.comV.setParametro("est");
		this.comV.esegui(this.game);
		assertSame(this.stanzaDoveAnd, this.game.getLabirinto().getStanzaCorrente() );
	
	}

}
