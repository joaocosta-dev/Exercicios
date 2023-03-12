package model;

public class Jogador {
	
	private String nome;
	private Baralho baralho;
	private int pontuacao;
	
	public Jogador() {}
	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Baralho getBaralho() {
		return baralho;
	}
	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public void somarPontuacao(int pontosRodada) {
		this.pontuacao += pontosRodada; 
	}
	
	public boolean verificarVencedor() {
		if(this.pontuacao >= 70) {
			return true;
		}
		
		return false;
	}
	
}