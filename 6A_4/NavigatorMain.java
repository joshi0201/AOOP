package six_a4;
import java.util.Scanner;
public class NavigatorMain {
	
	    public static void main(String[] args) {
	        WebNavigator webNavigator = new WebNavigator();
	        Scanner scanner = new Scanner(System.in);
	        boolean isRunning = true;

	        while (isRunning) {
	            System.out.println("\nNavigator Menu:");
	            System.out.println("1. Open new page");
	            System.out.println("2. Go back");
	            System.out.println("3. Go forward");
	            System.out.println("4. Show active page");
	            System.out.println("5. Exit");
	            System.out.print("Select an option: ");

	            int selection = scanner.nextInt();
	            scanner.nextLine();

	            switch (selection) {
	                case 1:
	                    System.out.print("Enter URL: ");
	                    String url = scanner.nextLine();
	                    webNavigator.openPage(url);
	                    break;
	                case 2:
	                    webNavigator.navigateBack();
	                    break;
	                case 3:
	                    webNavigator.navigateForward();
	                    break;
	                case 4:
	                    webNavigator.showActivePage();
	                    break;
	                case 5:
	                    isRunning = false;
	                    break;
	                default:
	                    System.out.println("Invalid option selected.");
	            }
	        }

	        scanner.close();
	        System.out.println("Web Navigator closed.");
	    }
	}

