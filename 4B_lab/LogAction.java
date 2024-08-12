package FourB;

	public class LogAction implements Action {
	    private Handler handler;
	    private Severity severity;

	    public LogAction(Handler handler, Severity severity) {
	        this.handler = handler;
	        this.severity = severity;
	    }

	    @Override
	    public void perform(String details) {
	        System.out.println("Performing log action for severity: " + severity);
	        handler.process(severity, details);
	    }
	}
