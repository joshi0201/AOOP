package twoA;

public class SessionManager {
	    private static SessionManager instance;
	    private String currentUser;

	    private SessionManager() {}

	    public static SessionManager getInstance() {
	        if (instance == null) {
	            instance = new SessionManager();
	        }
	        return instance;
	    }

	    public void loginUser(String username, String password) {
	        currentUser = username;
	        System.out.println("Session started for user: " + username);
	    }

	    public String getCurrentUser() {
	        System.out.println("Current user: " + currentUser);
	        return currentUser;
	    }
	}
