package question5;

public class AudioBook extends Book{

	//Vars
	private Integer bookFileSize; 
	private Double playbackLength; 
	private String narrator; 
	
	//Constructor
	public AudioBook(String aTitle, Integer pubYear, String aAuthor, Integer aBookFileSize, Double aPlaybackLength, String aNarrator) {
		super(aTitle, pubYear, aAuthor);
		bookFileSize = aBookFileSize;
		playbackLength = aPlaybackLength;
		narrator = aNarrator;
	}

	//Setters
	public void setBookFileSize(Integer aBookFileSize) {
		bookFileSize = aBookFileSize;
	}
	
	public void setPlaybackLength(Double aPlaybackLength) {
		playbackLength = aPlaybackLength;
	}
	
	public void setNarrator(String aNarrator) {
		narrator = aNarrator;
	}
	
	//Getters
	public Integer getBookFileSize() {
		return bookFileSize;
	}
	
	public Double getPlaybackLength() {
		return playbackLength;
	}
	
	public String getNarrator() {
		return narrator;
	}
	
	//Print Method
	@Override 
	public String toString() {
		return "AudioBook [Playback Length: " + playbackLength + ", Book File Size: " + bookFileSize + ", Narrator: " + narrator +"]";
	}

}
