package it.uniroma3.diadia_0_1.ambienti;

import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

public class Labirinto {
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	public Labirinto() {
		creaStanze();
		this.setStanzaCorrente(stanzaCorrente);
		this.setStanzaVincente(stanzaVincente); 
		System.out.println(MESSAGGIO_BENVENUTO.toString());
		
	}

	private static final String MESSAGGIO_BENVENUTO = 
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi metterli nella borsa, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	
	/**
     * Crea tutte le stanze e le porte di collegamento
     */
		private void creaStanze() {

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
		Attrezzo spada = new Attrezzo("spada",4);
		Attrezzo gemma = new Attrezzo("gemma",1);
    	
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		/* collega le stanze */
		atrio.impostaUscita("nord", biblioteca);
		atrio.impostaUscita("est", aulaN11);
		atrio.impostaUscita("sud", aulaN10);
		atrio.impostaUscita("ovest", laboratorio);
		aulaN11.impostaUscita("est", laboratorio);
		aulaN11.impostaUscita("ovest", atrio);
		aulaN10.impostaUscita("nord", atrio);
		aulaN10.impostaUscita("est", aulaN11);
		aulaN10.impostaUscita("ovest", laboratorio);
		laboratorio.impostaUscita("est", atrio);
		laboratorio.impostaUscita("ovest", aulaN11);
		biblioteca.impostaUscita("sud", atrio);

        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		laboratorio.addAttrezzo(spada);
		atrio.addAttrezzo(gemma);

		// il gioco comincia nell'atrio
        stanzaCorrente = atrio;  
		stanzaVincente = biblioteca;
    }
		public Stanza getStanzaVincente() {
			return stanzaVincente;
		}

		public void setStanzaCorrente(Stanza stanzaCorrente) {
			this.stanzaCorrente = stanzaCorrente;
		}
		
		public void setStanzaVincente(Stanza stanzaVincente){
			this.stanzaVincente = stanzaVincente;
		}

		public Stanza getStanzaCorrente() {
			return this.stanzaCorrente;
		}
		
}
