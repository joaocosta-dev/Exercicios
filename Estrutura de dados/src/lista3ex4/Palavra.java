package lista3ex4;

import java.util.Arrays;

public class Palavra {
	    char[] vogais;
	    char[] consoantes;
	

	public static Palavra criaPalavra(String palavra) {
	 
	    char[] vogais = new char[palavra.length()];
	    char[] consoantes = new char[palavra.length()];

	    
	    int posVogais = 0;
	    int posConsoantes = 0;

	   
	    for (int i = 0; i < palavra.length(); i++) {
	        char letra = palavra.charAt(i);

	        // Verifica se a letra � uma vogal ou consoante
	        if (isVogal(letra)) {
	            // Verifica se a vogal j� foi adicionada ao array
	            if (!contains(vogais, letra)) {
	                vogais[posVogais++] = letra;
	            }
	        } else {
	            // Verifica se a consoante j� foi adicionada ao array
	            if (!contains(consoantes, letra)) {
	                consoantes[posConsoantes++] = letra;
	            }
	        }
	    }

	    // Redimensiona os arrays para remover os espa�os n�o utilizados
	    vogais = Arrays.copyOf(vogais, posVogais);
	    consoantes = Arrays.copyOf(consoantes, posConsoantes);

	    // Cria e retorna um objeto Palavra com os arrays de vogais e consoantes
	    Palavra p = new Palavra();
	    p.vogais = vogais;
	    p.consoantes = consoantes;

	    return p;
	}

	// Fun��o auxiliar para verificar se uma letra � vogal
	public static boolean isVogal(char letra) {
	    letra = Character.toLowerCase(letra);
	    return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
	}

	// Fun��o auxiliar para verificar se um array cont�m um determinado elemento
	public static boolean contains(char[] array, char elem) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == elem) {
	            return true;
	        }
	    }
	    return false;
	}
	}