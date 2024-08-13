package srp;

public class PaymentProcessorDemo {
	public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails("Sha", "Designer");
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        double payment = paymentProcessor.processPayment(employee);
        System.out.println("Processed payment: " + payment);
    }


}
