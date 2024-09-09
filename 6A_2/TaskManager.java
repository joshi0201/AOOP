package six_a2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	    private List<Job> jobList;

	    public TaskManager() {
	        jobList = new ArrayList<>();
	    }

	    public void addJob(String details) {
	        jobList.add(new Job(details));
	    }

	    public void modifyJob(int index, String updatedDetails) {
	        if (index >= 0 && index < jobList.size()) {
	            jobList.get(index).setDetails(updatedDetails);
	        } else {
	            System.out.println("Index out of bounds");
	        }
	    }

	    public void deleteJob(int index) {
	        if (index >= 0 && index < jobList.size()) {
	            jobList.remove(index);
	        } else {
	            System.out.println("Index out of bounds");
	        }
	    }

	    public void listJobs() {
	        if (jobList.isEmpty()) {
	            System.out.println("The job list is empty.");
	        } else {
	            for (int i = 0; i < jobList.size(); i++) {
	                System.out.println((i + 1) + ". " + jobList.get(i));
	            }
	        }
	    }
	}

