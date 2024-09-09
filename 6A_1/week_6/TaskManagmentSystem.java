package week_6;

public class TaskManagmentSystem {
	    public static void main(String[] args) {
	        System.out.println("Task Management System started.");
	        TaskManager taskManager = new TaskManager();
	        
	        taskManager.addTask("Finish project report");
	        taskManager.addTask("Plan team meeting");
	        
	        taskManager.displayTasks();
	        
	        taskManager.updateTask(1, "Plan team meeting for next week");
	        
	        taskManager.displayTasks();
	        
	        taskManager.removeTask(0);
	        
	        taskManager.displayTasks();
	    }
	}
