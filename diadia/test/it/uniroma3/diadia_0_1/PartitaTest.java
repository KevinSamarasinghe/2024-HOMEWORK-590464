package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.ambienti.Labirinto;
import it.uniroma3.diadia_0_1.ambienti.Stanza;
import it.uniroma3.diadia_0_1.giocatore.Giocatore;

import org.junit.Before;
import org.junit.Test;

public class PartitaTest {
		private Partita game;
		private Partita won;
		private Labirinto lab;
		private Giocatore gioc;
		private int CFU;
		private Stanza stanzaVincente;
		private Stanza stanzaCorrente;
		
	@Before
	public void setUp() throws Exception {
		this.game=new Partita();
		this.won= new Partita();
		this.lab = new Labirinto();
		this.gioc = new Giocatore();
		this.won.getGiocatore().setCfu(0);
		this.game.getGiocatore().setCfu(20);
		this.CFU=0;
		this.stanzaVincente= new Stanza("Stanza Dell'Oro");
		this.stanzaCorrente = new Stanza("Stanza di Partenza");
		this.won.getLabirinto().setStanzaVincente(stanzaVincente);
		this.won.getLabirinto().setStanzaCorrente(stanzaVincente);
		this.game.getLabirinto().setStanzaVincente(stanzaVincente);
		this.game.getLabirinto().setStanzaCorrente(stanzaCorrente);
		
	}	
	
	@Test
	public void testNonVinta() {
		assertFalse(this.game.vinta());
	}
	
	@Test
	public void testVinta() {
		assertTrue(this.won.vinta());
	}
	
	@Test
	public void testIsFinita() {
		this.game.setFinita();
		assertTrue(this.game.isFinita());
	}
	
	
	@Test
	public void testIsFinitaPerCfu() {
		this.game.getGiocatore().setCfu(CFU);
		assertTrue(this.game.isFinita());
	}
	
	@Test
	public void testIsNotFinita() {
		assertFalse(this.game.isFinita()); //cfu non finiti - finita= false - vinta = false 
	}
	
	
	@Test
	public void testIsFinitaVinta() {
		assertTrue(this.won.isFinita());
	}


}
