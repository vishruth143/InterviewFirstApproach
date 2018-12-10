package JavaInterviewQuestions;

import java.util.Scanner;

public class ReverseStringPreserveSpace {
	
//	Function to reverse the string and preserve the space position 
    static void reverses(String str) {  
    	char[] inputArray = str.toCharArray();  
        char[] result = new char[inputArray.length]; 
        
//  	Mark spaces in result 
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] == ' ') {  
                result[i] = ' ';  
            }  
        }
        
//      Traverse input string from beginning and put characters in result from end 
        int j = result.length - 1;  
        for (int i = 0; i < inputArray.length; i++) {  
              
                // Ignore spaces in input string 
                if (inputArray[i] != ' ') {  
                                  
                    // Ignore spaces in result. 
                    if (result[j] == ' ') {  
                        j--;  
                    }     
                    result[j] = inputArray[i];  
                    j--;  
                }  
        }  
        System.out.println(String.valueOf(result));  
	}

	public static void main(String[] args) {
		System.out.println("Enter the input string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		reverses(str);
		in.close();
	}
}
