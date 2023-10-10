package week4.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class classAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "google";  // 4 unique characters
		
		System.out.println("The actual String is:" + " " + string);
		
		// split into char[]
		char[] chars = string.toCharArray();
				
		
		Set<Character> uniqueChars = new HashSet<>();  // create an empty set to put the unique chars into
		Set<Character> dupChars = new HashSet<>();  
		
		System.out.println("The string in the set:" + " " +uniqueChars);
		
		for(char ch : chars)
		{
			if(!uniqueChars.add(ch))
			{
				dupChars.add(ch);
			}
		}
		for(Character c : uniqueChars )
		{
			System.out.println("The unique characters are:" + " " +c);
		
		}
		
		System.out.println();
		
		for(Character c : dupChars )
		{
			System.out.println("The duplicate characters are:" + " " +c);
		
		}
		
		
	}
	}


