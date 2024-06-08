package it.uniroma3.diadia_0_1.comandi;

import it.uniroma3.diadia_0_1.Partita;

public class ComandoAiuto implements Comando {
	private static String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa","borsa","guarda"};
	
	public void esegui(Partita partita) {
		System.out.println("Comandi a disposizione:");
    	for(int i=0; i< elencoComandi.length; i++) 
			System.out.print(elencoComandi[i]+", ");
		System.out.println();
	    }

	public void setParametro(String parametro) {
		
	}

}
