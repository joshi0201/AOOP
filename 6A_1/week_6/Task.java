package week_6;

	public class Task {
	    private String description;

	    public Task(String description) {
	        System.out.println("Task created with description: " + description);
	        this.description = description;
	    }

	    public String getDescription() {
	        System.out.println("Returning task description: " + description);
	        return description;
	    }

	    public void setDescription(String description) {
	        System.out.println("Updating task description from: " + this.description + " to: " + description);
	        this.description = description;
	    }
	}

	
	