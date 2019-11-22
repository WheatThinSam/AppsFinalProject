package application.model;

public class Books {
	private String title;
	private int chapter, verse;
	
	// I was thinking of making book objects and listing them so that it would change based on 
	// the name being picked in the read view, but the read view is not working either rn something
	// with gluon is what it said?  Anyways love you 

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the chapter
	 */
	public int getChapter() {
		return chapter;
	}

	/**
	 * @param chapter the chapter to set
	 */
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	/**
	 * @return the verse
	 */
	public int getVerse() {
		return verse;
	}

	/**
	 * @param verse the verse to set
	 */
	public void setVerse(int verse) {
		this.verse = verse;
	}
	
}
