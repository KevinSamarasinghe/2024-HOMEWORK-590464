package it.uniroma3.diadia_0_1;

import it.uniroma3.diadia_0_1.ambienti.Labirinto;
import it.uniroma3.diadia_0_1.ambienti.Stanza;
import it.uniroma3.diadia_0_1.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  Paolo Merialdo, Valter Crescenzi (da un'idea di Michael Kolling and David J. Barnes)
 * @see Stanza
 * @version 0.1
 */

public class Partita {
	
	private boolean finita;
	private Labirinto labirinto;
	private Giocatore player;
	
	public Partita(){
		creaLabirinto();
		creaGiocatore();
		this.finita = false;
	}
	
	private void creaGiocatore(){
		this.player = new Giocatore();
	}
	
	public Giocatore getGiocatore(){
		return this.player;
	}
	
	private void creaLabirinto(){
		this.labirinto= new Labirinto();
	}
	public Labirinto getLabirinto(){
		return this.labirinto;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente()== this.labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || !giocatoreIsVivo();
	}

	public boolean giocatoreIsVivo(){
		return this.player.getCfu()!=0;
	}
	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	
}
