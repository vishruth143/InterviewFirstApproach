package JavaInterviewQuestions;

import java.util.Scanner;

public class NumberOfWordsInAString {
	
	static final int OUT = 0;
	static final int IN = 1;
	
	static void countNumberOfWords(String str) {
		
		int state = OUT;
		int wc = 0, i=0;
		
		while(i<str.length()) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i)== '\t') {
				state = OUT;
			}else if(state == OUT) {
				state = IN;
				++wc;
			}
			i++;
		}
		System.out.println("The number of word in a given string is: "+wc);
	}

	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		countNumberOfWords(str);
		in.close();
	}

}
