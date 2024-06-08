package it.uniroma3.diadia_0_1.giocatore;

public class Giocatore {
	
	private Borsa borsa;
	private int CFU;
	private static int CFU_INIZIALI = 20;


	public Giocatore(){
		creaBorsa();
		this.CFU = CFU_INIZIALI;	
}
	private void creaBorsa(){
		this.borsa = new Borsa();
	}
	
	public Borsa getBorsa(){
		return this.borsa;
	}
	
	public int getCfu() {
		return this.CFU;
	}

	public void setCfu(int cfu) {
		this.CFU = cfu;		
	}
}


