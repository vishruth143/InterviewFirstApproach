package JavaInterviewQuestions;
import java.util.HashMap;
import java.util.Scanner;

class FirstNonRepeatingCharacter {		
	public static void main(String[] args) {
		System.out.println("Please enter an input string: ");
		
		//Take a input
		Scanner in = new Scanner(System.in);
		
		//Assign value into string
		String str = in.nextLine();	
		
		//Length of the string
		int len = str.length();
		
		//Using HashMap
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		Character ch;
		
		for(int i=0; i<len;i++) {
			ch = str.charAt(i);
			
			//If character is already exists then increment it's count by 1
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				//If no value set for the character set it to 1
				charCount.put(ch, 1);
			}
		}
		
		for(int j=0; j<str.length();j++) {
			ch = str.charAt(j);
			
			if(charCount.get(ch)==1) {
				System.out.println("The first non-repeated character is: "+ch);
				break;
			}
		}
		in.close();
	}
}
