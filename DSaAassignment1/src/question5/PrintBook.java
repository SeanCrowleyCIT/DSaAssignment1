package question5;

public class PrintBook extends Book{
	
	private String publisher;
	private String ISBN; 
	
	
	public PrintBook(String aTitle, Integer pubYear, String aAuthor, String aPublisher, String aISBN) {
		super(aTitle, pubYear, aAuthor);
		publisher = aPublisher;
		ISBN = aISBN; 
	}
	
	//Setters
	public void setPublisher(String aPublisher) {
		publisher = aPublisher;
	}
	
	public void setISBN(String aISBN) {
		ISBN = aISBN;
	}
	
	//Getters
	public String getPublisher() {
		return publisher;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	//Print Method
	@Override 
	public String toString() {
		return "PrintBook [Publisher: " + publisher + ", ISBN: " + ISBN + "]";
	}
	

}
