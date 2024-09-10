package week_6B;

	import java.util.Comparator;

	public class WageComparator implements Comparator<Worker> {
	    @Override
	    public int compare(Worker w1, Worker w2) {
	        return Double.compare(w1.getWage(), w2.getWage());
	    }
	}
