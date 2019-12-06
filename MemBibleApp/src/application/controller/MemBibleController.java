package application.controller;

import javafx.scene.web.WebView;
import java.io.IOException;
import java.util.Random;

import application.model.Bible;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class MemBibleController {

	@FXML
	public TextArea memVerse;
	public Text book_Chap_Verse;
	public Label memVerseTimeCount;
	public Button book, chapter, verse;
	public Pane read, select;
	public SplitPane split;
	public Bible asv;
	public ComboBox choice;
	
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	public WebView wViewer = new WebView();
	
	@FXML
	public void processChallenge(ActionEvent event) throws IOException {
	    
		
		if(((Button) event.getSource()).getText().compareToIgnoreCase("Prayer") == 0) {
			wViewer.getEngine().load("https://www.youtube.com/watch?v=CHc46MMVWkI&t=637s");
		}
		else if (((Button) event.getSource()).getText().compareToIgnoreCase("Faith") == 0) {
			wViewer.getEngine().load("https://www.youtube.com/watch?v=GGnWqBGJKAg");
		}
		else if (((Button) event.getSource()).getText().compareToIgnoreCase("Relationships") == 0) {
			wViewer.getEngine().load("https://www.youtube.com/watch?v=H7h5BHax06c&vl=en");
		}
			
		else if (((Button) event.getSource()).getText().compareToIgnoreCase("Fasting") == 0) {
			wViewer.getEngine().load("https://www.youtube.com/watch?v=wckWsKr7-78");
		}
		else {
			wViewer.getEngine().load("https://www.youtube.com/watch?v=1FIzTihe5-M");
		}
		
	}
	
	@FXML
	public void changeViewDV(ActionEvent event) throws IOException {

		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/DailyVerse.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();

	}

	@FXML
	public void changeViewM(ActionEvent event) throws IOException {

		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Memorize.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();
		
	}

	@FXML
	public void changeViewC(ActionEvent event) throws IOException {

		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Challenges.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();

	}

	@FXML
	public void changeViewR(ActionEvent event) throws IOException {

		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/Read.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();

	}

	@FXML
	public void compileBook(ActionEvent event) {
		book_Chap_Verse.setText(((Button) event.getSource()).getText());
	}

	@FXML
	public void compileChap(ActionEvent event) {
		book_Chap_Verse.setText(book_Chap_Verse.getText() + " " + ((Button) event.getSource()).getText());
	}

	@FXML
	public void read(ActionEvent event) throws IOException {
		read.toFront();
		read.setOpacity(1);
		select.setOpacity(0);
		select.toBack();
		asv = new Bible();
		memVerse.setText(asv.loadBible());
	}

	@FXML
	public void compileVerseMem(ActionEvent event) throws IOException {
		book_Chap_Verse.setText(book_Chap_Verse.getText() + ":" + ((Button) event.getSource()).getText());
		split.toFront();
		split.setOpacity(1);
		select.setOpacity(0);
		select.toBack();
		asv = new Bible();
		asv.loadBible();
		memVerse.setText(asv.setTextVerse(book_Chap_Verse.getText()));
	}

	@FXML
	public void goHome(ActionEvent event) throws IOException {
		Parent newView = FXMLLoader.load(getClass().getResource("/application/view/AppView.fxml"));
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
		Scene newViewScene = new Scene(newView);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(newViewScene);
		window.show();

	}
	
	@FXML
	public void daily(ActionEvent event) throws IOException {
		Random rand = new Random();
		split.toFront();
		select.setOpacity(0);
		select.toBack();
		split.setOpacity(1);
		asv = new Bible();
		asv.loadBible();
		memVerse.setText(asv.setTextVerseInt(rand.nextInt(878)));
	}
}
