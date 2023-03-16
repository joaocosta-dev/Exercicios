package fibonacci;

public class Fibonacci
{
	/*
	 * Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor
	 * sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem
	 * avisando se o n�mero informado pertence ou n�o a sequ�ncia.
	 */
	public static String isFibonnaci(int num)
	{
		int atual = 1,anterior=0, fibo=0;
		String mensagem="";

		for(int i = num; i >= 0; i--)
		{
			if(num == fibo)
			{
				mensagem="O n�mero faz parte da sequ�ncia de Fibonacci";
				break;
			}
			
			else
			{
				mensagem="O n�mero n�o faz parte da sequ�ncia de Fibonacci";
			}
			
			fibo=anterior+atual;
			anterior=atual;
			atual=fibo;
		}
		return mensagem;
	}
}