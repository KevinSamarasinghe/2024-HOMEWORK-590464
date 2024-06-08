package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public interface Comando {
	/** 
	 * esecuzione del comando
	 */
	public void esegui(Partita partita);
	
	public void setParametro(String parametro);

}
