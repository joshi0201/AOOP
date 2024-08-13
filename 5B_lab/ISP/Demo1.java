package isp;

	public class Demo1 {
	    public static void main(String[] args) {
	        Job android = new Android();
	        android.perform();

	        Person person = new Person();
	        person.perform();
	        person.consume();
	    }
	}

