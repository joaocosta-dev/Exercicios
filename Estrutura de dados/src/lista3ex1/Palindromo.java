package lista3ex1;

public class Palindromo {
	
		public static boolean ehPalindromo(String[] texto) {
			int tamanho=texto.length;
			boolean resultado=false;
			for (int i=0; i< texto.length;i++) {
				if(i==tamanho-1) {
				resultado = true;
				}
				if(texto[i]!=texto[tamanho-1]) {
					resultado = false;
					break;
				}
				else {
					resultado=true;
				}
				tamanho--;
			}
		
			return resultado;
		}

}
