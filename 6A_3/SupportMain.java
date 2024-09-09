package six_a3;

import java.util.Scanner;
public class SupportMain {
	    public static void main(String[] args) {
	        HelpDeskQueue helpDeskQueue = new HelpDeskQueue();
	        Scanner scanner = new Scanner(System.in);
	        boolean isActive = true;

	        while (isActive) {
	            System.out.println("\nHelp Desk Support System:");
	            System.out.println("1. Add New Support Request");
	            System.out.println("2. Handle Next Request");
	            System.out.println("3. Show All Requests");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");

	            // Check for valid integer input to prevent crashes on invalid input
	            if (!scanner.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a number between 1 and 4.");
	                scanner.next(); // Clear the invalid input
	                continue;
	            }

	            int option = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (option) {
	                case 1:
	                    System.out.print("Enter client name: ");
	                    String clientName = scanner.nextLine();
	                    System.out.print("Enter request details: ");
	                    String requestDetails = scanner.nextLine();
	                    helpDeskQueue.addRequest(clientName, requestDetails);
	                    break;
	                case 2:
	                    helpDeskQueue.handleNextRequest();
	                    break;
	                case 3:
	                    helpDeskQueue.showAllRequests();
	                    break;
	                case 4:
	                    isActive = false;
	                    System.out.println("Exiting the system...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
	            }
	        }

	        scanner.close();
	        System.out.println("Help Desk Support System terminated.");
	    }
	}
