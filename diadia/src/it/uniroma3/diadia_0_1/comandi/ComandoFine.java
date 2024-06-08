package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoFine implements Comando{

	public void esegui(Partita partita) {
		System.out.println("Partita Finita");
		partita.setFinita();
	}

	public void setParametro(String parametro) {		
	}
}
