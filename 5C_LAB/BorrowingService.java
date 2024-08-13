package fiveC;

	class BorrowingService implements Borrow {
	    
	    @Override
	    public void borrowBook(Book book, Member member) {
	        if (book.isAvailable()) {
	            book.setAvailable(false);
	            System.out.println(member.getName() + " borrowed " + book.getTitle());
	        } else {
	            System.out.println(book.getTitle() + " is not available for borrowing.");
	        }
	    }

	    @Override
	    public void returnBook(Book book, Member member) {
	        book.setAvailable(true);
	        System.out.println(member.getName() + " returned " + book.getTitle());
	    }
	}

