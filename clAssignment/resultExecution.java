package week4.clAssignment;


public class resultExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments p1 = new Amazon();
		p1.cashOnDelivery();
		p1.cardPayments();
		p1.upiPayments();
		p1.internetBanking();
		
		CanaraBank rp = new Amazon();
		rp.recordPaymentDetails();
	
	
	}

}
