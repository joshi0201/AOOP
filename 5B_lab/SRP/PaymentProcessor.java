package srp;

public class PaymentProcessor {
	 public double processPayment(EmployeeDetails employee) {
	        String position = employee.getPosition();
	        double payment = 0.0;
	        // Payment calculation logic based on position
	        System.out.println("Processing payment for position: " + position);
	        return payment;
	    }

}
