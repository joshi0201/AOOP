package six_a4;
import java.util.ArrayDeque;
import java.util.Deque;

public class WebNavigator {

	    private Deque<String> previousPages;
	    private Deque<String> nextPages;
	    private String activePage;

	    public WebNavigator() {
	        previousPages = new ArrayDeque<>();
	        nextPages = new ArrayDeque<>();
	        activePage = null;
	    }

	    public void openPage(String url) {
	        if (activePage != null) {
	            previousPages.push(activePage);
	        }
	        activePage = url;
	        nextPages.clear();
	        System.out.println("Opening: " + activePage);
	    }

	    public void navigateBack() {
	        if (!previousPages.isEmpty()) {
	            nextPages.push(activePage);
	            activePage = previousPages.pop();
	            System.out.println("Navigating back to: " + activePage);
	        } else {
	            System.out.println("No pages to go back to.");
	        }
	    }

	    public void navigateForward() {
	        if (!nextPages.isEmpty()) {
	            previousPages.push(activePage);
	            activePage = nextPages.pop();
	            System.out.println("Navigating forward to: " + activePage);
	        } else {
	            System.out.println("No pages to go forward to.");
	        }
	    }

	    public void showActivePage() {
	        if (activePage != null) {
	            System.out.println("Currently viewing: " + activePage);
	        } else {
	            System.out.println("No active page.");
	        }
	    }
	}

