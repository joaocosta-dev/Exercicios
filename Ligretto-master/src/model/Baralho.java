package model;

public class Baralho {
	Carta carta = new Carta();
	private String cor;

	public Baralho() {}
	Carta[] baral = new Carta[40]; 
	
	public Baralho(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public List<Carta> getCarta(){
		
	}
	public boolean jogarCarta() {
	if(carta.getNumero()==(mesaCarta+1) ){
		
	}
	}

	
	
	
}
