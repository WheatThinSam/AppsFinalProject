package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemBibleController {
	
	@FXML
	public void changeViewDV(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/DailyVerse.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}
	@FXML
	public void changeViewM(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Memorize.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}
	@FXML
	public void changeViewC(ActionEvent event) throws IOException {
	
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Challenges.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
	
	}
	@FXML
	public void changeViewR(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Read.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}
	
	@FXML
	public void goHome(ActionEvent event) throws IOException {
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/AppView.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
	}
	
}
