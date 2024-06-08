package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;


	public class ComandoGuarda implements Comando {
		

		
		public void esegui(Partita partita) {
			System.out.println(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		}

		
		public void setParametro(String parametro) {
		}
		
}
