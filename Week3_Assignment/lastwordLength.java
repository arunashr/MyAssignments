/**
 * 
 */
package Week3_Assignment;

/**
 * 
 */
public class lastwordLength {

	/**
	 * @param args
	 */
	public int wordLength(String sentence)
	{
		String[] esplit = sentence.split(" ");
		String Word = esplit[esplit.length-1];
		int wordLength = Word.length();
		return wordLength;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Hello World";
		String input2 = "fly me to the moon";
		String input3 = "luffy is still joyboy";
		lastwordLength  lwLength = new lastwordLength();
		System.out.println("Last Word Length in Input1: " + lwLength.wordLength(input1));
		System.out.println("Last Word Length in Input2: " + lwLength.wordLength(input2));
		System.out.println("Last Word Length in Input3: " + lwLength.wordLength(input3));
		
		
	}

}
