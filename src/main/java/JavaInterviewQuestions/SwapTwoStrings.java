package JavaInterviewQuestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
//		String temp;
		
//		First attempt
//		temp = a;
//		a=b;
//		b=temp;
//		System.out.println("a: "+a+"\n"+"b: "+b);
		
		a = a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a: "+a+"\n"+"b: "+b);
	}
}
