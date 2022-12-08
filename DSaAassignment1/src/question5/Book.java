package question5;

public class Book {
	
	//Variables
	private String title;
	private Integer year;
	private String author; 
	
	//Constructor
	public Book(String aTitle, Integer pubYear, String aAuthor) {
		title = aTitle;
		year = pubYear; 
		author = aAuthor; 
	}
	
	//setters
	public void setTitle(String aTitle) {
		title = aTitle;
	}
	
	public void setPubYear(Integer pubYear) {
		year = pubYear;
	}
	
	public void setAuthor(String aAuthor) {
		author = aAuthor;
	}
	
	
	//getters
	public String getTitle() {
		return title; 
	}
	
	public Integer getPubYear() {
		return year;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override 
	public String toString() {
		return "Book [Title: " + title + ", Year of Publication: " + year + ", Author: " + author +"]";
	}

}
