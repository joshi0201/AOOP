package week_6;

import java.util.ArrayList;

public class TaskManager {
	    private ArrayList<Task> tasks;

	    public TaskManager() {
	        tasks = new ArrayList<>();
	        System.out.println("Task Manager initialized.");
	    }

	    public void addTask(String description) {
	        System.out.println("Adding task: " + description);
	        tasks.add(new Task(description));
	    }

	    public void updateTask(int index, String newDescription) {
	        System.out.println("Updating task at index " + index + " to new description: " + newDescription);
	        if (index >= 0 && index < tasks.size()) {
	            tasks.get(index).setDescription(newDescription);
	        } else {
	            System.out.println("Invalid index: " + index);
	        }
	    }

	    public void removeTask(int index) {
	        System.out.println("Removing task at index: " + index);
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	        } else {
	            System.out.println("Invalid index: " + index);
	        }
	    }

	    public void displayTasks() {
	        System.out.println("Displaying all tasks:");
	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println("Task " + (i + 1) + ": " + tasks.get(i).getDescription());
	        }
	    }
	}
