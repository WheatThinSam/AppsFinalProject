package application.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bible {
	public ArrayList<Book_Chap_Verse> bible = new ArrayList<Book_Chap_Verse>();
//	public String bibleR = "";
	
	public String loadBible() throws IOException {
		String bibleR = "";
		Scanner bibleFile = new Scanner(new File("src/BibleData/John.csv"));
		while(bibleFile.hasNext()) {
			String[] tokens = bibleFile.nextLine().split(",", 2);
				String book_chap_verse = tokens[0];
				String verse = tokens[1];
				bibleR = bibleR + ("\n" + tokens[0] + ": " + tokens[1]);
				Book_Chap_Verse verses = new Book_Chap_Verse(book_chap_verse, verse);
				bible.add(verses);
				
		}

		bibleFile.close();
		return bibleR;
	}
	
	
//	public String getBibleR() {
//		return bibleR;
//	}
//
//
//
//	public void setBibleR(String bibleR) {
//		this.bibleR = bibleR;
//	}



	public ArrayList<Book_Chap_Verse> getBible() {
		return bible;
	}



	public void setBible(ArrayList<Book_Chap_Verse> bible) {
		this.bible = bible;
	}

	public String setTextVerse(String ver) {
		String yo = "";
		for(Book_Chap_Verse item: bible) {
			if(ver.compareToIgnoreCase(item.getBook_chap_verse()) == 0) {
				yo = item.getBook_chap_verse() + ": " + item.getVerse();
			}
			
		}
		return yo;
	}
	
	public String setTextVerseInt(int ver) {
		String yo = "";
		yo = bible.get(ver).getBook_chap_verse() + ": " + bible.get(ver).getVerse();
		return yo;
	}
}
