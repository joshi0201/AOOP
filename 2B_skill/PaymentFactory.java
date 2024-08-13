package twoA;

public abstract class PaymentFactory {
	abstract class PaymentServiceFactory {
	    abstract PaymentService createPaymentService();
	}

	class DebitCardFactory extends PaymentServiceFactory {
	    public PaymentService createPaymentService() {
	        return new DebitCard();
	    }
	}


}
