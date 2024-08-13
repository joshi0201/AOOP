package isp;

	public class Person implements Job, Feeder {
	    @Override
	    public void perform() {
	        System.out.println("Person is performing a task.");
	    }

	    @Override
	    public void consume() {
	        System.out.println("Person is consuming food.");
	    }
	}

