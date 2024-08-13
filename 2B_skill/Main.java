package twoA;

public class Main {
	    public static void main(String[] args) {
	        
	        TransportFactory taxiFactory = new TaxiFactory();
	        Transport taxi = taxiFactory.createTransport();
	        taxi.start();

	        TransportFactory motorcycleFactory = new MotorcycleFactory();
	        Transport motorcycle = motorcycleFactory.createTransport();
	        motorcycle.start();

	        PaymentServiceFactory debitCardFactory = new DebitCardFactory();
	        PaymentService debitCardPayment = debitCardFactory.createPaymentService();
	        debitCardPayment.processPayment(50.0);

	        SessionManager sessionManager = SessionManager.getInstance();
	        sessionManager.loginUser("john_doe", "password123");
	        sessionManager.getCurrentUser();
	    }
	}