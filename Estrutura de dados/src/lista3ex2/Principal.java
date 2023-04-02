package lista3ex2;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = {{7, 8, 9},{4, 5, 6},{1, 2, 3} };
		int[][] transposta = MatrizTransposta.transposta(matriz);

		for (int i = 0; i < transposta.length; i++) {
		    for (int j = 0; j < transposta[0].length; j++) {
		        System.out.print(transposta[i][j] + " ");
		    }
		    System.out.println();
		}	
			
	}

}
