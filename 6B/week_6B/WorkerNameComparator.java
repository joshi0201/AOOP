package week_6B;

	import java.util.Comparator;

	public class WorkerNameComparator implements Comparator<Worker> {
	    @Override
	    public int compare(Worker w1, Worker w2) {
	        return w1.getWorkerName().compareTo(w2.getWorkerName());
	    }
	}
