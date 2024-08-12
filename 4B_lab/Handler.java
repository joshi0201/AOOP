package FourB;

	public abstract class Handler {
	    protected Handler nextHandler;

	    public void setNextHandler(Handler nextHandler) {
	        this.nextHandler = nextHandler;
	    }

	    public void process(Severity severity, String details) {
	        if (canProcess(severity)) {
	            log(details);
	        } else if (nextHandler != null) {
	            nextHandler.process(severity, details);
	        } else {
	            System.out.println("No handler found for severity: " + severity);
	        }
	    }

	    protected abstract boolean canProcess(Severity severity);

	    protected abstract void log(String details);
	}

