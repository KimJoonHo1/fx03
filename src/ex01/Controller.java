package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("초기화 목적으로 사용합니다.");
		btn.setOnAction(e->{
			String text = txtField.getText();
			txtField.setText("");
			txtField2.setText(text);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("조심하세요");
			alert.show();
		});
	}
	
	public void txtPrint() {
		System.out.println(txtField.getText());
		System.out.println(txtField.toString());
	}
}
