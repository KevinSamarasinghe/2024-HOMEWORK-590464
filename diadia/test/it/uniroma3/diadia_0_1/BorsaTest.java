package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;
import it.uniroma3.diadia_0_1.giocatore.Borsa;

import org.junit.Before;
import org.junit.Test;

public class BorsaTest {
	private Borsa borsaVuota;
	private String nomeMatita;
	private Borsa borsaConPennaEmatita;
	private Attrezzo matita;
	private Attrezzo penna;
	
	@Before
	public void setUp() throws Exception {
		this.borsaVuota=new Borsa();
		this.nomeMatita=new String("matita");
		this.matita=new Attrezzo("matita",1);
		this.penna=new Attrezzo("penna",2);
		this.borsaConPennaEmatita=new Borsa();
		this.borsaConPennaEmatita.addAttrezzo(matita);
		this.borsaConPennaEmatita.addAttrezzo(penna);
		
	}

	@Test
	public void testRemoveAttrezzoDaBorsaVuota() {
		assertTrue(this.borsaVuota.isEmpty());
		Attrezzo a = this.borsaVuota.removeAttrezzo(this.nomeMatita);
		assertNull(a);
		assertTrue(this.borsaVuota.isEmpty());
		
	}
	
	@Test
	public void testRemoveAttrezzoParametroNull() {
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		assertTrue(this.borsaVuota.isEmpty());
		Attrezzo a = this.borsaConPennaEmatita.removeAttrezzo(null);
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		assertEquals(this.borsaConPennaEmatita.getPeso(), 3);
		assertNull(a);
		
		a = this.borsaVuota.removeAttrezzo(null);
		assertTrue(this.borsaVuota.isEmpty());
		assertEquals(this.borsaVuota.getPeso(), 0);
	}
	
	@Test
	public void testRemoveAttrezzoPresente() {
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		Attrezzo a = this.borsaConPennaEmatita.removeAttrezzo("temperino");
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		assertEquals(this.borsaConPennaEmatita.getPeso(), 3);
		assertNull(a);
	}
	
	@Test
	public void testRemoveAttrezzoNonPresente() {
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		Attrezzo a = this.borsaConPennaEmatita.removeAttrezzo("penna");
		assertFalse(this.borsaConPennaEmatita.isEmpty());
		assertEquals(this.borsaConPennaEmatita.getPeso(), 1);
		assertSame(a, this.penna);
	}
	
	
}
