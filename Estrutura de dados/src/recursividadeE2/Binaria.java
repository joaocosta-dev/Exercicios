package recursividadeE2;

public class Binaria {

	public static String baseBinaria(int n) {
		if (n == 0) {
	        return "0";
	    } else if (n == 1) {
	        return "1";
	    } else {
	        int resto = n % 2;
	        int quociente = n / 2;
	        return baseBinaria(quociente) + resto;
	    }
	}
}
