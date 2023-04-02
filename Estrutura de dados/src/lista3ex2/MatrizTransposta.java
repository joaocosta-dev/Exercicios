package lista3ex2;

public class MatrizTransposta {

		public static int[][] transposta(int valor[][]) {
			int i = 0,j = 0;
			 int linhas = valor.length;
			 int colunas = valor[0].length;
			int transp[][]= new int[colunas][linhas];
		
			if (linhas == 0 || colunas == 0) {
		        System.out.println("A matriz está vazia");
		        return null;
		    }
			
			for(i=0;i<linhas;i++) {
				for(j=0;j<colunas;j++) {
					transp[j][i]=valor[i][j];
				}
			}
		return transp;
		}
		
		
}
		
