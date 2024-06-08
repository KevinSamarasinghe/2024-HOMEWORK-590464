package it.uniroma3.diadia_0_1;

import it.uniroma3.diadia_0_1.comandi.Comando;
import it.uniroma3.diadia_0_1.comandi.FabbricaDiComandiSemplice;

import java.util.Scanner;

/**
 *  Classe principale di\	 diadia, un semplice gioco di ruolo ambientato al dia.
 *  Per giocare crea un'istanza di questa classe e invoca il letodo gioca
 *
 *  Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  Paolo Merialdo (da un'idea di Michael Kolling and David J. Barnes) *
 * @version 0.1
 */

public class DiaDia {
	private Partita partita;

   
    public DiaDia() {
    	this.partita = new Partita();
    }

	public void gioca() {
		String istruzione; 
	    Scanner scannerDiLinee;
	    scannerDiLinee = new Scanner(System.in);		
		do		
			istruzione = scannerDiLinee.nextLine();
		while (!processaIstruzione(istruzione));
	}   
    
        
	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
		private boolean processaIstruzione(String istruzione) {
			Comando comandoDaEseguire;
			
			FabbricaDiComandiSemplice factory = new FabbricaDiComandiSemplice();
			
			comandoDaEseguire = factory.costruisciComando(istruzione);
			
			comandoDaEseguire.esegui(this.partita);
			
			if(this.partita.vinta())
				System.out.println("Hai Vinto!");
			if(!(this.partita.giocatoreIsVivo()))
				System.out.println("CFU esauriti...");
			return this.partita.isFinita();
		}

	public static void main(String[] argc) {
		DiaDia gioco = new DiaDia();
		gioco.gioca();
	}
}