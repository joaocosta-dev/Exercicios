package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		calcula();
	}
	public static void calcula () {
		int n,i,k=13,g=13;
		ArrayList<String> lista = new ArrayList<String>();
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero"));
		
		if(n>0) {
			for(i=2;g<=n;i++) {
				lista.add(""+g);
				g=k*i;
			}
			System.out.print(lista);
		}
		else {
			System.out.println("Erro. Valor negativo informado.");
		}
	}
}
