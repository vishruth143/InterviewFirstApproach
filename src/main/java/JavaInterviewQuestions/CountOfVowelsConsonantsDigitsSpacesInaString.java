package JavaInterviewQuestions;

import java.util.Scanner;

public class CountOfVowelsConsonantsDigitsSpacesInaString {

	static void count(String str) {
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if (ch >= '0' && ch <= '9') {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
		}
		System.out.println("Number of vowels: " + vowels + "\n" +
						   "Number of consonants: " + consonants + "\n" +
						   "Number of digits: "+ digits + "\n" +
						   "Number of spaces: " + spaces);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		count(str);
		in.close();
	}
}
