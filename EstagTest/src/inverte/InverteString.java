package inverte;

public class InverteString {

	public static String inverteStr(String str) {
/*
 * variavel para receber o tamanho da string, como os parametros() de .length e
 * .charAt são diferentes precisamos de duas variaveis, uma para servir de
 * contador e uma para servir como valor fixo
 */
		int f = str.length() - 1;
		int c = f + 1;
/*
* String que vai receber a sequência contraria da string passada por parametro,
* caracter por caracter.
*/
		String nstr = "";
		
/*Loop que vai de 0 até o tamanho da string que estamos invertendo*/
		
		for (int i = 0; i < c; i++) {
/*
* metodo concat para concatenar o char da ultima posição da variavel passada
* por parametro(precisa ser convertido para String pq uma String nao pode
* receber uma variavel do tipo char
*/
			nstr = nstr.concat(Character.toString(str.charAt(f)));

			f--;
		}
		str = nstr;
		return str;
	}

}
