/**
 * 
 */
package Week1_Assignment;

/**
 * 
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 0, number2 = 1, number3, i, count = 8;    
		 
		 System.out.print(number1 + " " + number2);//printing 0 and 1    
		    
		 for(i = 2; i < count; i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 
		 
		  number3 = number1 + number2;
		  
		  System.out.print(" " + number3);    
		  
		  number1 = number2;    
		  
		  number2 = number3;   
		  
		  
		 }
	}

}
