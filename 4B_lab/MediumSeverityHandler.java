package FourB;

	public class MediumSeverityHandler extends Handler {
	    @Override
	    protected boolean canProcess(Severity severity) {
	        return severity == Severity.MEDIUM;
	    }

	    @Override
	    protected void log(String details) {
	        System.out.println("MEDIUM: " + details);
	    }

}
