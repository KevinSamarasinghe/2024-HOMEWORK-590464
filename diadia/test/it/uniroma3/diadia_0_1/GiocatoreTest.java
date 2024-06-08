package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.giocatore.Borsa;
import it.uniroma3.diadia_0_1.giocatore.Giocatore;

import org.junit.Before;
import org.junit.Test;

public class GiocatoreTest {
	private int CFU;
	private Borsa borsa;
	private Giocatore player;
	
	@Before
	public void setUp() throws Exception {
		this.CFU= 20;
		this.borsa = new Borsa();
		this.player = new Giocatore();
	}
	@Test
	public void testGetBorsa() {
		assertEquals(this.borsa.toString(),this.player.getBorsa().toString());
	}
	@Test
	public void testGetCFU() {
		assertSame(20, this.CFU);
	}
	@Test
	public void testSetCFU(){
		this.player.setCfu(10);
		assertSame(10,this.player.getCfu());
	}

}
