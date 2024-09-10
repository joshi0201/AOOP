package week_6B;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Application {
	    public static void main(String[] args) {
	        List<Worker> workers = new ArrayList<>();
	        workers.add(new Worker(3, "Michael", 47000));
	        workers.add(new Worker(1, "Sophia", 59000));
	        workers.add(new Worker(2, "David", 42000));

	        Collections.sort(workers);
	        System.out.println("Sorted by Worker ID:");
	        for (Worker w : workers) {
	            System.out.println(w);
	        }

	        Collections.sort(workers, new WorkerNameComparator());
	        System.out.println("\nSorted by Worker Name:");
	        for (Worker w : workers) {
	            System.out.println(w);
	        }

	        Collections.sort(workers, new WageComparator());
	        System.out.println("\nSorted by Wage:");
	        for (Worker w : workers) {
	            System.out.println(w);
	        }

	        Worker clonedWorker = workers.get(0).clone();
	        System.out.println("\nCloned Worker:");
	        System.out.println(clonedWorker);

	        System.out.println("\nIterating over workers:");
	        for (Worker w : workers) {
	            for (Worker wrk : w) {
	                System.out.println(wrk);
	            }
	        }
	    }
	}

