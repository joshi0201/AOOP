package FourB;

public class Application {
	    public static void main(String[] args) {
	       
	        Handler lowHandler = new LowSeverityHandler();
	        Handler mediumHandler = new MediumSeverityHandler();
	        Handler highHandler = new HighSeverityHandler();

	        
	        lowHandler.setNextHandler(mediumHandler);
	        mediumHandler.setNextHandler(highHandler);

	        
	        LoggerManager logger = new LoggerManager();
	        logger.addAction(new LogAction(lowHandler, Severity.LOW));
	        logger.addAction(new LogAction(mediumHandler, Severity.MEDIUM));
	        logger.addAction(new LogAction(highHandler, Severity.HIGH));

	        
	        logger.executeActions();
	    }
	}
