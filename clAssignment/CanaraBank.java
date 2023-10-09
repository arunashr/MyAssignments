package week4.clAssignment;

public abstract class CanaraBank implements Payments {

	
	// implements Payments
		public void recordPaymentDetails()
		{
			System.out.println("Payment detail added");
		}

		public abstract void checkpay();
}
