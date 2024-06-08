package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;
import it.uniroma3.diadia_0_1.ambienti.Stanza;

public class ComandoVai implements Comando {
	private String direzione;
	
	public void esegui(Partita partita) {
		Stanza stanzaCorrente = partita.getLabirinto().getStanzaCorrente();
		Stanza prossimaStanza = null;
		if (this.direzione==null){
			System.out.println("Dove vuoi andare?");
		return;
		}
		
		prossimaStanza = stanzaCorrente.getUscita(this.direzione);
		if(prossimaStanza==null){
			System.out.println("Direzione inesistente");
		return;
		}
		
		prossimaStanza = stanzaCorrente.getUscita(this.direzione);
		partita.getLabirinto().setStanzaCorrente(prossimaStanza);
		System.out.println(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
	}
	
	public void setParametro(String parametro){
		this.direzione = parametro;
	}
}
