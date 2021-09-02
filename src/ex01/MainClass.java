package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(1111111);
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		System.out.println(2222222);
		Scene scene = new Scene(root);
		System.out.println(3333333);
		arg0.setScene(scene);
		arg0.show();
	}
}
