package library;

public class LibrarypackageDemo {
public static void main(String[]args){
	Book book1 = new Book("java","sunmicrosystem","20",true);
	LibraryUser user1 = new LibraryUser("Saksham",304);
	user1.boorowBook();
	System.out.println(user1.getName()+"has borrowed"+user1.getNumBookBorrowed()+"book(s)");
	user1.returnBook();
	System.out.println(user1.getName()+"has returned a book");
	book1.setAvailable(false, false);
	System.out.println("Book Availability:"+(book1.isAvailable()?"Available":"Not available"));
}
}

