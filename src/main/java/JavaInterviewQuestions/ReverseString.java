package JavaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Selenium";
		int strLength = str.length();
		String revStr = "";
		
		for (int i=strLength-1;i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("The original string is: "+str+
				   		   "\n"+
				   		   "The reverse string is: "+revStr);
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println("The original string is: "+str+
						   "\n"+
						   "The reverse string is: "+sb.reverse());		
	}
}
