package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoBorsa implements Comando{


	public void esegui(Partita partita) {
		System.out.println(partita.getGiocatore().getBorsa().toString());	
	}

	
	public void setParametro(String parametro) {
	}

}
