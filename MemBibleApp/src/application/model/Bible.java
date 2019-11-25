package application.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bible {
	public ArrayList<Book_Chap_Verse> bible = new ArrayList<Book_Chap_Verse>();
	
	public void loadBible() throws IOException {
		Scanner bibleFile = new Scanner(new File("src/BibleData/bibles.csv"));
		while(bibleFile.hasNext()) {
			String[] tokens = bibleFile.nextLine().split(",");
			if(tokens[0].isEmpty()) {
				String book_chap_verse = tokens[0];
				String verse = tokens[1];
				Book_Chap_Verse verses = new Book_Chap_Verse(book_chap_verse, verse);
				bible.add(verses);
			}	
		}
		bibleFile.close();
	}
	
	
	
	public ArrayList<Book_Chap_Verse> getBible() {
		return bible;
	}



	public void setBible(ArrayList<Book_Chap_Verse> bible) {
		this.bible = bible;
	}



	public ArrayList<String> getVerse(String book_chap_verse) {
		return null;
	}
}
