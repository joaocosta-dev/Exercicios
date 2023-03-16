package inverte;

import javax.swing.JOptionPane;

public class TestaString {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite o texto a ser invertido:");
		JOptionPane.showMessageDialog(null,InverteString.inverteStr(texto));

	}

}
