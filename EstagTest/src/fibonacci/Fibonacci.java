package fibonacci;

public class Fibonacci
{
	/*
	 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
	 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
	 * avisando se o número informado pertence ou não a sequência.
	 */
	public static String isFibonnaci(int num)
	{
		int atual = 1,anterior=0, fibo=0;
		String mensagem="";

		for(int i = num; i >= 0; i--)
		{
			if(num == fibo)
			{
				mensagem="O número faz parte da sequência de Fibonacci";
				break;
			}
			
			else
			{
				mensagem="O número não faz parte da sequência de Fibonacci";
			}
			
			fibo=anterior+atual;
			anterior=atual;
			atual=fibo;
		}
		return mensagem;
	}
}