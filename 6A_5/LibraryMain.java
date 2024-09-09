package six_a5;

import java.util.Scanner;

public class LibraryMain {

	    public static void main(String[] args) {
	        SongLibrary library = new SongLibrary();
	        Scanner input = new Scanner(System.in);
	        boolean continueRunning = true;

	        while (continueRunning) {
	            System.out.println("\nLibrary Menu:");
	            System.out.println("1. Add Song");
	            System.out.println("2. Remove Song");
	            System.out.println("3. Change Song Position");
	            System.out.println("4. Display Library");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int selection = input.nextInt();
	            input.nextLine();

	            switch (selection) {
	                case 1:
	                    System.out.print("Enter song title: ");
	                    String title = input.nextLine();
	                    System.out.print("Enter artist name: ");
	                    String artist = input.nextLine();
	                    library.insertSong(title, artist);
	                    break;
	                case 2:
	                    System.out.print("Enter song title to delete: ");
	                    String titleToRemove = input.nextLine();
	                    library.deleteSong(titleToRemove);
	                    break;
	                case 3:
	                    System.out.print("Enter the original position of the song: ");
	                    int oldPosition = input.nextInt();
	                    System.out.print("Enter the desired new position: ");
	                    int newPosition = input.nextInt();
	                    library.rearrangeSong(oldPosition, newPosition);
	                    break;
	                case 4:
	                    library.listSongs();
	                    break;
	                case 5:
	                    continueRunning = false;
	                    break;
	                default:
	                    System.out.println("Option not recognized.");
	            }
	        }

	        input.close();
	        System.out.println("Song Library application closed.");
	    }
	}

