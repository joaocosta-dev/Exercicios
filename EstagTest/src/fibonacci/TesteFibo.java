package fibonacci;

import javax.swing.JOptionPane;

public class TesteFibo {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero a ser testado"));
		JOptionPane.showMessageDialog(null,Fibonacci.isFibonnaci(num));

	}

}
