package lista3ex3;

public class BuscaValorMatriz {

	public static int[] buscaValor(int[][] matriz, int procurado) {
		int linha = matriz.length;
		int coluna = matriz[0].length;
		int resposta[] = new int[2];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (matriz[i][j] == procurado) {

					resposta[0] = i;
					resposta[1] = j;
					System.out.println("Valor encontrado na posição [" + i + "] [" + j + "]");
					System.exit(0);

				} else {
					
					resposta[0] = -1;
					resposta[1] = -1;
				}
			}
		}
		return resposta;
	}
}
