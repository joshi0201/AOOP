package twoA;

public interface PaymentService {
	    void processPayment(double amount);
	}

	class DebitCard implements PaymentService {
	    public void processPayment(double amount) {
	        System.out.println("Debit Card payment processed.");
	    }
	}

	class ApplePay implements PaymentService {
	    public void processPayment(double amount) {
	        System.out.println("Apple Pay payment processed.");
	    }
	}

abstract class PaymentServiceFactory {
    abstract PaymentService createPaymentService();
}

class DebitCardFactory extends PaymentServiceFactory {
    public PaymentService createPaymentService() {
        return new DebitCard();
    }
}

class ApplePayFactory extends PaymentServiceFactory {
    public PaymentService createPaymentService() {
        return new ApplePay();
    }
}

