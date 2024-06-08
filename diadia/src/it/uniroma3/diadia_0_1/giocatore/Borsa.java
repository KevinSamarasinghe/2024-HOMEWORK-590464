package it.uniroma3.diadia_0_1.giocatore;

import it.uniroma3.diadia_0_1.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;

	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}

	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new Attrezzo[10]; 
		this.numeroAttrezzi = 0;
	}
	
	

	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		if (this.numeroAttrezzi==10)
			return false;
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
				a = attrezzi[i];
		return a;
	}
	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			peso += this.attrezzi[i].getPeso();
		return peso;
	}

	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}

	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}


	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a=null;
		boolean trovato=false;
		if(isEmpty()){
			System.out.println("Borsa Vuota");
		return a;
		}
		else
			for(int i=0;i<this.numeroAttrezzi&&!trovato;i++)
				if(this.attrezzi[i].getNome().equals(nomeAttrezzo)){
					a=this.attrezzi[i];
					this.attrezzi[i]=this.attrezzi[i+1];
					trovato=true;
					numeroAttrezzi--;
					}
		return a;
	}
	

	public String toString() {
		String s = new String();
    		if (!this.isEmpty()) {
    			s += "Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ";
    			for(int i=0; i<numeroAttrezzi;i++)
    	    		s+= this.attrezzi[i].getNome().toString()+" ";
    			}
    		else 
    			s += "Borsa vuota";
    		return s;
	}

}