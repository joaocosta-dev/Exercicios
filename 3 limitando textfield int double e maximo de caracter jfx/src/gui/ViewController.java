package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ViewController implements Initializable {
	
	@FXML
	private TextField tfN1;

	@FXML
	private TextField tfN2;

	@FXML
	private Button btSoma;

	@FXML
	private Label lbResultado;

	@FXML
	public void onBtSomaAction() {
		try {
		Locale.setDefault(Locale.US);

		double n1 = Double.parseDouble(tfN1.getText());
		double n2 = Double.parseDouble(tfN2.getText());
		double soma = n1+n2;
		lbResultado.setText(String.format("%.2f", soma));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}
/*interface initalizable, ele executa quando o compilador for criado, 
entao dentro dele eu coloco acoes que eu quero que sejam executadas assim que 
o compilador for instanciado*/
 	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(tfN1);
		Constraints.setTextFieldDouble(tfN2);
		/*Metodo para limitar a quantidade de digitos textfield, o segundo parametro 
		e o numero de digitos maximo */
		Constraints.setTextFieldMaxLength(tfN1, 10);
		
	}

}
