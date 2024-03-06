package library;

public class LibraryUser {
	private String name;
	private int ID,numBookBorrowed;
	public LibraryUser(String name,int ID) {
		this.name = name;
		this.ID = ID;
		numBookBorrowed = 0;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public int getNumBookBorrowed() {
		return numBookBorrowed;
	}
public void boorowBook() {
	numBookBorrowed++;
}
public void returnBook() {
	if(numBookBorrowed > 0)
		numBookBorrowed--;
}
}
