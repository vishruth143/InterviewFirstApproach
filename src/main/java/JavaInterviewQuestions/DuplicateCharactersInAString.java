package JavaInterviewQuestions;
import java.util.Scanner;

class DuplicateCharactersInAString {	
	
	static final int NO_OF_CHARS = 256; 
	
	/* Fills count array with frequency of characters */
    static void fillCharCounts(String str, int[] count) 
    { 
       for (int i = 0; i < str.length();  i++) 
          count[str.charAt(i)]++; 
    } 
	
	/* Print duplicates present in the passed string */
    static void printDups(String str) 
    { 
      // Create an array of size 256 and fill count of every character in it 
      int count[] = new int[NO_OF_CHARS]; 
      fillCharCounts(str, count); 
      
      for (int i = 0; i < NO_OF_CHARS; i++) 
        if(count[i] > 1) 
            System.out.printf("%c,  count = %d \n", i,  count[i]); 
       
    } 
	
	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		printDups(str);
		in.close();
	}
}
