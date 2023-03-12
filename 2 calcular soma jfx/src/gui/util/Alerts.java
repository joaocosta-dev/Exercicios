package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//classe criada para chamar alertas dentro do programa a partir de um objeto do javafx
public class Alerts {
	public static void showAlert(String title, String header, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}