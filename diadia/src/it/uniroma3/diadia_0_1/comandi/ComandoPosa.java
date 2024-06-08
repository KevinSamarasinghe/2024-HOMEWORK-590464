package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoPosa implements Comando {
	private String nomeAttrezzo;

	public void esegui(Partita partita) {
		if(partita.getGiocatore().getBorsa().isEmpty())
			 System.out.println("La borsa è vuota!");
		 else if(nomeAttrezzo==null)
			 System.out.println("Cosa vuoi posare?");
		 else if(partita.getGiocatore().getBorsa().hasAttrezzo(nomeAttrezzo)){
			 partita.getLabirinto().getStanzaCorrente().addAttrezzo(partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo));
			 partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);	
			 	System.out.println("Hai posato "+nomeAttrezzo);
		 	}
		 else System.out.println("Attrezzo non presente nella borsa");
		 }

	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}
}
