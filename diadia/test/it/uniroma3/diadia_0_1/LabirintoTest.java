package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.ambienti.Labirinto;
import it.uniroma3.diadia_0_1.ambienti.Stanza;

import org.junit.Before;
import org.junit.Test;

public class LabirintoTest {
	private Labirinto labirinto;
	private Stanza stanzavincente;
	private Stanza stanzacorrente;
	private Stanza stanzaX;
	
	@Before
	public void setUp() throws Exception {
		this.labirinto=new Labirinto();
		this.stanzavincente= new Stanza("Stanza Dell'Oro");
		this.stanzacorrente = new Stanza("Stanza di Partenza");
		this.labirinto.setStanzaCorrente(stanzacorrente);
		this.labirinto.setStanzaVincente(stanzavincente);
		this.stanzaX=new Stanza("Stanza magica");
	}

	@Test
	public void testGetStanzaVincente() {
		assertSame(this.stanzavincente, this.labirinto.getStanzaVincente());
	}

	
	@Test
	public void testGetStanzaCorrente() {
		assertSame(this.stanzacorrente, this.labirinto.getStanzaCorrente());
	}
	
	@Test
	public void testSetStanzaCorrente(){
		this.labirinto.setStanzaCorrente(stanzaX);	
		assertSame(this.stanzaX, this.labirinto.getStanzaCorrente());
	}
	
	public void testSetStanzaVincente(){
		this.labirinto.setStanzaVincente(stanzaX);
		assertSame(this.stanzaX,this.labirinto.getStanzaVincente());
	}
}
