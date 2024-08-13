package fiveC;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
    private List<Member> members;
    private BorrowingService borrowingService;

    public Library(BorrowingService borrowingService) {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowingService = borrowingService;
        System.out.println("Library created.");
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(String isbn, String memberId) {
        Book book = findBookByISBN(isbn);
        Member member = findMemberById(memberId);
        if (book != null && member != null) {
            borrowingService.borrowBook(book, member);
        }
    }

    public void returnBook(String isbn, String memberId) {
        Book book = findBookByISBN(isbn);
        Member member = findMemberById(memberId);
        if (book != null && member != null) {
            borrowingService.returnBook(book, member);
        }
    }

    private Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        System.out.println("Member not found with ID: " + memberId);
        return null;
    }
}
