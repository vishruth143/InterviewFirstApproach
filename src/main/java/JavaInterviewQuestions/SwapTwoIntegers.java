package JavaInterviewQuestions;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
//		First attempt
//		int temp;		
//		temp = x;
//		x=y;
//		y=temp;
//		System.out.println("x: "+x+"\n"+"y: "+y);
		
//		Second attempt
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		System.out.println("x: "+x+"\n"+"y: "+y);
		
//		Third attempt
//		x = x*y;
//		y = x/y;
//		x = x/y;
//		System.out.println("x: "+x+"\n"+"y: "+y);
		
//		Fourth attempt
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("x: "+x+"\n"+"y: "+y);
	}
}
