package application.controller;

import java.io.IOException;

import application.model.Bible;
import application.model.Book_Chap_Verse;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MemBibleController {
	@FXML
	public TextArea memVerse;
	public Text book_Chap_Verse;
	public Label memVerseTimeCount;
	public Button book, chapter, verse;
	public Bible asv = new Bible();
	public TabPane readTab;
	
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
	public void changeViewRD(ActionEvent event) throws IOException {
		compileVerse();
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/ReadDisplay.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		displayRead();
	}
	
	@FXML
	public void compileBook() {
		book_Chap_Verse.setText(book.getText());
	}
	
	@FXML
	public void compileChap() {
		book_Chap_Verse.setText(book_Chap_Verse.getText() + " " + chapter.getText());
	}
	
	@FXML
	public void compileVerse() {
		book_Chap_Verse.setText(book_Chap_Verse.getText() + ":" + verse.getText());
	}
	
	@FXML
	public void displayRead() throws IOException {
		asv.loadBible();
		for(Book_Chap_Verse bCV: asv.getBible()) {
			if(bCV.getBook_chap_verse().compareToIgnoreCase(book_Chap_Verse.getText()) == 1) {
				memVerse.setText(memVerse.getText() + bCV.verse);
			}
		}
	}
	
	
	@FXML
	public void goHome(ActionEvent event) throws IOException {
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/AppView.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
	}
	
	@FXML
	public void showVerse() {
		memVerse.setOpacity(1);
	}
	
	@FXML
	public void hideVerse() {
		memVerse.setOpacity(0);
	}
	
	@FXML
	public void changeViewMV(ActionEvent event) throws IOException {
		
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/MemVerse.fxml"));
		Scene newViewScene =  new Scene(newView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}

}
