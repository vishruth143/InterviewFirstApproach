package JavaInterviewQuestions;

public class NumberOfOccurancesOfACharacterInAStringWithoutLoop {

	public static void main(String[] args) {
		 String str = "Geeks of Geek";
		 System.out.println("Length Of String: " + str.length());
		 System.out.println("Length Of String Without 'e': " + str.replace("e", "").length());
		 int charcount = str.length() - str.replaceAll("e", "").length();
	     System.out.println("Occurrence of Char 'e' in givn string is: " + charcount);
	}
}
