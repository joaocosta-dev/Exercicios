package recursividadeE1;

public class ApenasCaracters {
/*FUNÇÃO RECURSIVA PARA VERIFICAR SE O TEXTO DIGITADO CONTEM
 * APENAS NUMEROS OU CONTEM STRINGS DANADAS NO MEIO, SE TIVER STRING 
 * NO MEIO VAI RETORNAR FALSE
 */

public static boolean isNumero(String texto) {
		
		if(texto.isEmpty()==true) {
			return true;
		}
		if(Character.isAlphabetic(texto.charAt(0))==true) {
				return false;
			}
		return isNumero(texto.substring(1));
		
	} 
}