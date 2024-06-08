package it.uniroma3.diadia_0_1.ambienti;

import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

/**
 * Classe Stanza - una stanza in un gioco di ruolo.
 * Una stanza e' un luogo fisico nel gioco.
 * E' collegata ad altre stanze attraverso delle uscite.
 * Ogni uscita e' associata ad una direzione.
 * @author Paolo Merialdo (a partire da un'idea di Michael Kolling e David J. Barnes)
 * @see Attrezzo
 * @version 0.1
*/

public class Stanza {
	private static final int NUMERO_MASSIMO_DIREZIONI = 4;
	private String nome;
	private Stanza[] stanzeConfinanti;
	private int numeroDirezioni;
    private String[] direzioni; 
    private Attrezzo[] attrezzi;
    private int numeroattstanza=0;

    /**
     * Crea una stanza. Inizialmente non ci sono uscite.
     * @param nome il nome della stanza
     */
    public Stanza(String nome) {
        this.nome = nome;
        this.numeroDirezioni = 0;
        this.direzioni = new String[NUMERO_MASSIMO_DIREZIONI];
        this.stanzeConfinanti = new Stanza[NUMERO_MASSIMO_DIREZIONI];
        this.attrezzi = new Attrezzo[5];
    }

    /**
     * Imposta le uscite della stanza. Ogni direzione porta ad un'altra stanza.
     *
     * @param direzione direzione in cui sara' posta la stanza.
     * @param stanza stanza da collegare alla stanza corrente tramite l'uscita
     * indicata in direzione.
     */
    
    public void impostaUscita(String direzione, Stanza stanza) {
        boolean aggiornato = false;
    	for(int i=0; i<this.direzioni.length; i++)
        	if (direzione.equals(this.direzioni[i])) {
        		this.stanzeConfinanti[i] = stanza;
        		aggiornato = true;
        	}
    	if (!aggiornato) 
    		if (this.numeroDirezioni < NUMERO_MASSIMO_DIREZIONI) {
    			this.direzioni[numeroDirezioni] = direzione;
    			this.stanzeConfinanti[numeroDirezioni] = stanza;
    		    this.numeroDirezioni++;
    		}
    }

    /**
     * Restituisce la stanza dell'uscita specificata
     * @param direzione
     */
	public Stanza getUscita(String direzione) {
        Stanza stanza = null;
		for(int i=0; i<this.numeroDirezioni; i++)
        	if (this.direzioni[i].equals(direzione))
        		stanza = this.stanzeConfinanti[i];
        return stanza;
	}

    /**
     * Restituisce la nome della stanza.
     * @return il nome della stanza
     */
    public String getNome() {
        return this.nome;
    }
	
    /**
     * Restituisce la descrizione della stanza.
     * @return la descrizione della stanza
     */
    public String getDescrizione() {
        return this.toString();
    }


    /**
     * Colloca un attrezzo nella stanza.
     * @param attrezzo l'attrezzo da collocare nella stanza.
     *        Impostare a null per rappresentare l'assenza
     *        di attrezzi nella stanza.
     */
    public void addAttrezzo(Attrezzo attrezzo) {
        		if(this.numeroattstanza!=this.attrezzi.length){
        			this.attrezzi[this.numeroattstanza]= attrezzo;
        			this.numeroattstanza++;
        			}else
        				System.out.println("stanza piena");
        			
    }

   /**
	* Restituisce una rappresentazione stringa di questa stanza,
	* stampadone la descrizione, le uscite e gli eventuali attrezzi contenuti
	* @return la rappresentazione stringa
	*/
    public String toString() {
    	String s = new String();
    	
    	s += this.nome;
    	s += "\nUscite: ";
    	for (String direzione : this.direzioni)
    		if (direzione!=null)
    			s += " " + direzione;
    	s += "\nAttrezzi nella stanza: ";
    	if(numeroattstanza==0)
    		s+="Nessuno";
    	else
    	for(int i=0; i<numeroattstanza;i++)
    		s+= this.attrezzi[i].getNome().toString()+" ";
    	return s;
    }

    /**
	* Controlla se un attrezzo esiste nella stanza (uguaglianza sul nome).
	* @return true se l'attrezzo esiste nella stanza, false altrimenti.
	*/
	public boolean hasAttrezzo(String nomeAttrezzo) {
		boolean attrezzoPresente=false;
		for(int i=0; i<this.numeroattstanza && !attrezzoPresente;i++)
			if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
				attrezzoPresente = true;
		return attrezzoPresente;
	}

	/**
     * Restituisce l'attrezzo nomeAttrezzo se presente nella stanza.
	 * @param nomeAttrezzo
	 * @return l'attrezzo presente nella stanza.
     * 		   null se l'attrezzo non e' presente.
	 */
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo attrezzo=null;
			for(int i=0; i<this.numeroattstanza;i++)	
				if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
					attrezzo=this.attrezzi[i];
				return attrezzo;
	}

	/**
	 * Rimuove un attrezzo dalla stanza (ricerca in base al nome).
	 * @param nomeAttrezzo
	 */
	public boolean removeAttrezzo(Attrezzo attrezzo) {
		boolean attrezzorimosso=false;
		for(int i=0; i<this.numeroattstanza && !attrezzorimosso;i++)
			if(attrezzi[i].getNome().equals(attrezzo.getNome())){
				this.attrezzi[i]=this.attrezzi[this.numeroattstanza-1];
				numeroattstanza--;
				attrezzorimosso=true;
		}
		
		return attrezzorimosso;
 }
	/**Restituisce true se la stanza è vuota, cioè se non ci sono attrezzi	*/
	public boolean isEmpty() {
		return this.numeroattstanza == 0;
	}
}