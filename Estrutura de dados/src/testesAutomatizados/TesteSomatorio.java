package testesAutomatizados;

public class TesteSomatorio {

	public static void main(String[] args) {
	System.out.println("INICIO DOS TESTES...");
	
	teste01();
	teste02();
	teste03();
	teste04();
	teste05();
	
	}

	public static void teste01() {
		int[] dados = { 1, 2, 3 };
		int calculo = CalculaSomatoria.somatoria(dados);

		
		if (calculo != 6) {
			System.err.println("Erro no teste! " + "Esperado = 6, " + "Retornado=" + calculo);
		} else {
			System.out.println("SUCESSO no teste");
		}
	}

	public static void teste02() {
		int[] dados = { -1, -2, -3 };
		int calculo = CalculaSomatoria.somatoria(dados);

		
		if (calculo != -6) {
			System.err.println("Erro no teste! " + "Esperado = -6, " + "Retornado=" + calculo);
		} else {
			System.out.println("SUCESSO no teste");
		}
	}

	public static void teste03() {
		int[] dados = { 10 };
		int calculo = CalculaSomatoria.somatoria(dados);

		
		if (calculo != 10) {
			System.err.println("Erro no teste! " + "Esperado = 10, " + "Retornado=" + calculo);
		} else {
			System.out.println("SUCESSO no teste");
		}
	}

	public static void teste04() {
		int[] dados = { -1, 3, 10, -4 };
		int calculo = CalculaSomatoria.somatoria(dados);

	
		if (calculo != 8) {
			System.err.println("Erro no teste! " + "Esperado = 8, " + "Retornado=" + calculo);
		} else {
			System.out.println("SUCESSO no teste");
		}
	}

	public static void teste05() {
		int[] dados = {};
		int calculo = CalculaSomatoria.somatoria(dados);

		
		if (calculo != 0) {
			System.err.println("Erro no teste! " + "Esperado = 0, " + "Retornado=" + calculo);
		} else {
			System.out.println("SUCESSO no teste");
		}
		System.out.println("FINAL DOS TESTES...");

	}
}
