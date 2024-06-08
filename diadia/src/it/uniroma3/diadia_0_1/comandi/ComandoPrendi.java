package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoPrendi implements Comando {
	private String nomeAttrezzo;
	
	public void esegui(Partita partita) {
		if(partita.getLabirinto().getStanzaCorrente().isEmpty())
			 System.out.println("Nella stanza non ci sono attrezzi");
		 else if(nomeAttrezzo==null)
			 System.out.println("Cosa vuoi prendere?");
		 
		 else if(partita.getLabirinto().getStanzaCorrente().hasAttrezzo(nomeAttrezzo)){
			 if(partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo).getPeso()<partita.getGiocatore().getBorsa().getPesoMax()){
				 partita.getGiocatore().getBorsa().addAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo));
				 	partita.getLabirinto().getStanzaCorrente().removeAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo));
				 		System.out.println("Hai preso "+nomeAttrezzo);
				 		}
			 else System.out.println("Non hai spazio nella borsa!");
		 }
		 else System.out.println("Attrezzo non presente nella stanza");
	 }
		
	


	public void setParametro(String parametro) {
		this.nomeAttrezzo=parametro;
		
	}

}
