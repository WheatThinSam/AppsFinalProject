package application.model;

public class Book_Chap_Verse {
	public String book_chap_verse, verse;
	
	public Book_Chap_Verse(String book_chap_verse, String verse) {
		this.book_chap_verse = book_chap_verse;
		this.verse = verse;
	}

	public String getBook_chap_verse() {
		return book_chap_verse;
	}

	public void setBook_chap_verse(String book_chap_verse) {
		this.book_chap_verse = book_chap_verse;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	@Override
	public String toString() {
		return "Book_Chap_Verse [book_chap_verse=" + book_chap_verse + ", verse=" + verse + "]";
	}
	
}
