package it.uniroma3.diadia_0_1;

import static org.junit.Assert.*;
import it.uniroma3.diadia_0_1.ambienti.Stanza;
import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class StanzaTest {
	private Stanza stanzaVuota;
	private Stanza stanzaConAttrezzo;
	private Stanza stanzaConUscita;
	private Attrezzo piatto;
	private Attrezzo lanterna;
	
	@Before
	public void setUp() throws Exception {
		this.stanzaConUscita = new Stanza("Studio");
		this.stanzaVuota= new Stanza("Camera");
		this.stanzaConAttrezzo = new Stanza("Cucina");
		this.piatto = new Attrezzo("Piatto",2); 
		this.lanterna = new Attrezzo("Lanterna",3);
		this.stanzaConAttrezzo.addAttrezzo(piatto);
		this.stanzaConUscita.impostaUscita("est", this.stanzaVuota);
		
		
	}

	@Test
	public void testAddAttrezzoInStanzaVuota() {
		assertTrue(this.stanzaVuota.isEmpty());
		this.stanzaVuota.addAttrezzo(lanterna);
		assertSame(lanterna, this.stanzaVuota.getAttrezzo("Lanterna"));
	}
	
	@Test
	public void testAddAttrezzoInStanzaConAttrezzo() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		this.stanzaConAttrezzo.addAttrezzo(lanterna);
		assertSame(lanterna, this.stanzaConAttrezzo.getAttrezzo("Lanterna"));
	}

	@Test
	public void testHasAttrezzoStanzaVuota() {
		assertTrue(this.stanzaVuota.isEmpty());
		assertFalse(this.stanzaVuota.hasAttrezzo("Piatto"));
	}
	
	@Test
	public void testHasAttrezzoStanzaConAttrezzoPresente(){
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertTrue(this.stanzaConAttrezzo.hasAttrezzo("Piatto"));
	}
	
	@Test
	public void testHasAttrezzoStanzaConAttrezzoNonPresente(){
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertFalse(this.stanzaConAttrezzo.hasAttrezzo("Bicchiere"));
	}

	@Test
	public void testGetAttrezzoNonPresente() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertNull(this.stanzaConAttrezzo.getAttrezzo("Bicchiere"));
	}
	
	@Test
	public void testGetAttrezzoPresente() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertSame(piatto, this.stanzaConAttrezzo.getAttrezzo("Piatto"));
	}
	
	@Test
	public void testGetAttrezzoDaStanzaVuota() {
		assertTrue(this.stanzaVuota.isEmpty());
		assertNull(this.stanzaVuota.getAttrezzo("Piatto"));
	}
	
	
	@Test
	public void testRemoveAttrezzoDaStanzaVuota() {
		assertTrue(this.stanzaVuota.isEmpty());
		assertFalse(this.stanzaVuota.removeAttrezzo(lanterna));
	}
	
	@Test
	public void testRemoveAttrezzoPresenteDaStanzaConAttrezzo() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertTrue(this.stanzaConAttrezzo.removeAttrezzo(piatto));
	}
	
	@Test
	public void testRemoveAttrezzoNonPresenteDaStanzaConAttrezzo() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
		assertFalse(this.stanzaConAttrezzo.removeAttrezzo(lanterna));
	}

	@Test
	public void testIsEmptyStanzaVuota() {
		assertTrue(this.stanzaVuota.isEmpty());
		
	}
	
	@Test
	public void testIsEmptyStanzaNonVuota() {
		assertFalse(this.stanzaConAttrezzo.isEmpty());
	}
	
	@Test
	public void testGetDescrizione() {
		assertEquals("Studio"+"\nUscite:  est"+"\nAttrezzi nella stanza: Nessuno",this.stanzaConUscita.getDescrizione());
	}
	@Test
	public void testImpostaUscita() {
		this.stanzaVuota.impostaUscita("est", stanzaConAttrezzo);
		assertSame(this.stanzaConAttrezzo,this.stanzaVuota.getUscita("est"));
	}
	
	@Test
	public void testGetUscita() {
		assertSame(this.stanzaVuota, this.stanzaConUscita.getUscita("est"));
	}
	@Test
	public void testGetNome() {
		assertEquals("Studio", this.stanzaConUscita.getNome());
	}

}
