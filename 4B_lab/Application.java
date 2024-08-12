package FourB;

public class Application {
	    public static void main(String[] args) {
	        // Set up the handlers
	        Handler lowHandler = new LowSeverityHandler();
	        Handler mediumHandler = new MediumSeverityHandler();
	        Handler highHandler = new HighSeverityHandler();

	        // Set the chain of responsibility
	        lowHandler.setNextHandler(mediumHandler);
	        mediumHandler.setNextHandler(highHandler);

	        // Create logger and actions
	        LoggerManager logger = new LoggerManager();
	        logger.addAction(new LogAction(lowHandler, Severity.LOW));
	        logger.addAction(new LogAction(mediumHandler, Severity.MEDIUM));
	        logger.addAction(new LogAction(highHandler, Severity.HIGH));

	        // Execute the logging actions
	        logger.executeActions();
	    }
	}
