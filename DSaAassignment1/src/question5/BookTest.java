package question5;

public class BookTest {

	public static void main(String[] args) {
		//Test Book 
		Book book1 = new Book("0", 0, "0");
		book1.setTitle("Fire and Blood");
		book1.setPubYear(2018);
		book1.setAuthor("George R.R. Martin");
		
		System.out.print(book1.toString());
		System.out.println();
		
		//Test AudioBook
		AudioBook book2 = new AudioBook("0", 0, "0", 0, 0., "0");
		book2.setTitle("Dooku: Jedi Lost");	
		book2.setPubYear(2019);
		book2.setAuthor("Cavan Scott");
		book2.setBookFileSize(427);
		book2.setPlaybackLength(382.13);
		book2.setNarrator("Orlagh Cassidy");
		
		System.out.print(book2.toString());
		System.out.println();
		
		//Test PrintBook
		PrintBook book3 = new PrintBook("0", 0, "0", "0", "0");
		book3.setTitle("Ulysses");	
		book3.setPubYear(1922);
		book3.setAuthor("James Joyce");
		book3.setPublisher("Shakespeare and Company");
		book3.setISBN("8601300112145");
		
		System.out.print(book3.toString());

	}

}
