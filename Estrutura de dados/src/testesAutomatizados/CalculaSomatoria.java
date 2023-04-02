package testesAutomatizados;

public class CalculaSomatoria {

	static int somatoria(int[]valores) {
		int soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			soma = soma + valores[i];
		}
		return soma;
	}
}
