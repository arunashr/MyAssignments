package week4.clAssignment;

public class Amazon extends CanaraBank implements Payments {
	
	public void cashOnDelivery()
	{
		System.out.println("Pay by Cash");
	}
	
	public void upiPayments()
	{
		System.out.println("Pay by UPI");
	}
	
	public void cardPayments()
	{
		System.out.println("Pay by Card");
	}
	
	
	public void internetBanking()
	{
		System.out.println("Pay by NET");
	}

	public void checkpay()
	{
		
	}
}
