package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemBibleCotroller {
	
	@FXML
	public void changeViewDV(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/DailyVerse.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}
	
	public void changeViewM(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("DailyVerse.html"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}

	public void changeViewC(ActionEvent event) throws IOException {
	
		Parent newView = FXMLLoader.load(getClass().getResource("DailyVerse.html"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
	
	}

	public void changeViewR(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("DailyVerse.html"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}
}
