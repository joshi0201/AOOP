package six_a2;
import java.util.Scanner;
public class TaskApp {

	    public static void main(String[] args) {
	        TaskManager taskManager = new TaskManager();
	        Scanner scanner = new Scanner(System.in);
	        boolean isRunning = true;

	        while (isRunning) {
	            System.out.println("\nTask Management Menu:");
	            System.out.println("1. Add Job");
	            System.out.println("2. Modify Job");
	            System.out.println("3. Delete Job");
	            System.out.println("4. List Jobs");
	            System.out.println("5. Exit");
	            System.out.print("Select an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter job details: ");
	                    String details = scanner.nextLine();
	                    taskManager.addJob(details);
	                    break;
	                case 2:
	                    System.out.print("Enter job number to modify: ");
	                    int modifyIndex = scanner.nextInt() - 1;
	                    scanner.nextLine(); 
	                    System.out.print("Enter updated details: ");
	                    String updatedDetails = scanner.nextLine();
	                    taskManager.modifyJob(modifyIndex, updatedDetails);
	                    break;
	                case 3:
	                    System.out.print("Enter job number to delete: ");
	                    int deleteIndex = scanner.nextInt() - 1;
	                    taskManager.deleteJob(deleteIndex);
	                    break;
	                case 4:
	                    taskManager.listJobs();
	                    break;
	                case 5:
	                    isRunning = false;
	                    break;
	                default:
	                    System.out.println("Invalid selection. Please choose again.");
	            }
	        }

	        scanner.close();
	        System.out.println("Task Management application closed.");
	    }
	}

