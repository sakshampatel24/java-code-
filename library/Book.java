package library;
public class Book{
	private String title,author,ISBN;
	private boolean available;
	public Book(String title,String author,String ISBN,boolean available) {
	this.title = title;
	this.author = author;
	this.ISBN = ISBN;
	this.available = available;	
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public String getISBN() {
	return ISBN;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean availabe, boolean available)
{
	this.available = available;
}
}