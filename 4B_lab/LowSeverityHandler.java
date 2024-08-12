package FourB;

	public class LowSeverityHandler extends Handler {
	    @Override
	    protected boolean canProcess(Severity severity) {
	        return severity == Severity.LOW;
	    }

	    @Override
	    protected void log(String details) {
	        System.out.println("LOW: " + details);
	    }


}
