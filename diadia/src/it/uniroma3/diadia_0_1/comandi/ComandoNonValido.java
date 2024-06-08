package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoNonValido implements Comando {
			
	public void esegui(Partita partita) {
		System.out.println("Comando non valido");	
	}
	
	public void setParametro(String parametro) {	
	}
}
