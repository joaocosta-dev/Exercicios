package ex1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		calcula();
	}
public static void calcula () {
	int n;
	n= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero"));
	int i,qtd=0,par=0,media=0;
	if(n>0) {
		for(i=0;i<=n;i++) {
			if (i%2 == 0) {
				qtd++;
				par=par+i;
			}
		}
		media=par/qtd;
		System.out.printf("A media dos primeiros "+n+" numeros é "+media);
	}
	else {
		System.out.println("Erro. Valor negativo informado.");
	}
	
	
	
}
}
