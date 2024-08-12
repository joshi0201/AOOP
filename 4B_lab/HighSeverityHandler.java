package FourB;

	public class HighSeverityHandler extends Handler {
	    @Override
	    protected boolean canProcess(Severity severity) {
	        return severity == Severity.HIGH;
	    }

	    @Override
	    protected void log(String details) {
	        System.out.println("HIGH: " + details);
	    }
	}
