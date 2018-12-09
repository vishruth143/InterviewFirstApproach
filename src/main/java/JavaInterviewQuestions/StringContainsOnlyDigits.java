package JavaInterviewQuestions;

import java.util.Scanner;

public class StringContainsOnlyDigits {
	
	static boolean containsOnlyDigits(String str){
		return str.matches("[0-9]+");
	}

	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		if(containsOnlyDigits(str)) {
			System.out.println("String contains only digits.");
		}else {
			System.out.println("String doesn't contains only digits.");
		}
		
		in.close();
	}
}
