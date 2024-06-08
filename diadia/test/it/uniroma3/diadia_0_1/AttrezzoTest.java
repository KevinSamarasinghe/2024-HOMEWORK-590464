package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class AttrezzoTest {
	private Attrezzo ascia;
	private Attrezzo bastone;
	
	@Before
	public void setUp() throws Exception {
		this.ascia= new Attrezzo("Ascia",5);
		this.bastone= new Attrezzo("Bastone",4);
	}

	@Test
	public void testGetNome() {
		assertEquals("Ascia",this.ascia.getNome());
	}

	@Test
	public void testGetPeso() {
		assertEquals(5,this.ascia.getPeso());
	}
	

	@Test
	public void testToString() {
		assertEquals("Ascia (5kg)", this.ascia.toString());
	}

}
