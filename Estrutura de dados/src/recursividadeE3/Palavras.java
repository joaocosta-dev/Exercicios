package recursividadeE3;

public class Palavras {

	public static boolean isPalindromo(String nome) {
		int tamanho = nome.length();
		if(nome.isEmpty()== true || nome.length()==1) {
			return true;
		}
			if(nome.charAt(0)!= nome.charAt(tamanho-1)){
				return false;
		}
		
		nome=nome.substring(1,(tamanho-1));
		return isPalindromo(nome);
	}
}
