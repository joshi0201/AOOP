package fiveC;

public class Main {
	 public static void main(String[] args) {
	        BorrowingService borrowingService = new BorrowingService();
	        Library library = new Library(borrowingService);

	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9876");

	        Member member1 = new Member("Sreya", "M001");
	        Member member2 = new Member("Joshi", "M002");

	        library.addBook(book1);
	        library.addBook(book2);
	        library.addMember(member1);
	        library.addMember(member2);

	        library.borrowBook("1234", "M001");
	        library.returnBook("1234", "M001");
	    }
	}

