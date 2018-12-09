package JavaInterviewQuestions;

public class RemoveJankCharactersFromAString {
	
	public static void main(String[] args) {
		
		String str = "$%#^%#^%#^%#& Actual string 0123456789";		
		//Regular Expression [^a-zA-Z0-9]
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The string after removing the junk chracters: "+str);	
	}
}
