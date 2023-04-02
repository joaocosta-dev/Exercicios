package lista3ex4;

public class TestaPalavra {

	public static void main(String[] args) {
		String texto="leitao";
		
		System.out.println("Vogais: ");
		System.out.println(Palavra.criaPalavra(texto).vogais);
		System.out.println("Consoantes: ");
		System.out.println(Palavra.criaPalavra(texto).consoantes);
			
			
		

	}

}
