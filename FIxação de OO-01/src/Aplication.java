import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Rectangle;

public class Aplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
			
		
		
		rectangle.height= sc.nextDouble();
		rectangle.widht= sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n",rectangle.area());
		System.out.printf("PERIMETER = %.2f\n",rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f",rectangle.diagonal());
		
		sc.close();
	}

}
