package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
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

}
