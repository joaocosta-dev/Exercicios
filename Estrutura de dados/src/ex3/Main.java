package ex3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		primo();

	}
		public static void primo() {
			int i,num;
			num=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero"));
			if(num>2) {
				for(i = 2; i <= num; i++) {
		            boolean primo = true;        
		            for(int j = 2; j < i; j++) {            
		                if(i % j == 0) {
		                    primo = false;
		                }
		            }
		            if(primo) {
		                System.out.println("O numero "+i+" � primo");
		            }     
		            else {
		            	System.out.println("O numero "+i+" n�o � primo");
		            }
		       
			}
			 
			}
			else {
				System.out.println("O numero deve ser maior que um");
			}
		
	}
}
