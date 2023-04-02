package lista3ex3;

public class TestaBusca {

	public static void main(String[] args) {

		int[][] matriz = {{7, 8, 9},{4, 5, 6},{1, 2, 3} };
		int procurado = 7;
		int []vet = BuscaValorMatriz.buscaValor(matriz, procurado);
		for(int i=0;i<vet.length;i++) {
			System.out.print(vet[i]);
		}
		
	}

}
