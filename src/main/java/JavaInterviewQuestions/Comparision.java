package JavaInterviewQuestions;

public class Comparision {
//	Global level or class level variable
	static boolean b; //false
	static int i;
	static Comparision c;
	static String s;
	public static void main(String[] args) {
		System.out.println("The default value of boolean is: "+b);
		System.out.println("The default value of an integer is: "+i);
		System.out.println("The default value of an Object is: "+c);
		System.out.println("The default value of a String is: "+s);
		System.out.println(2==2);
		System.out.println("A"=="A");
		String x="Hello";
		String y="Hello";
		String z="Hello1";	
		System.out.println(x==y);
		System.out.println(y==z);
		
		System.out.println(x.equals(y));
		
		A a1 = new A();
		A a2 = new A();
		a1.i=100;
		a2.i=100;
		System.out.println(a1.i==a2.i);
		System.out.println(a1==a2); //Object
		//a1=a2;
		System.out.println(a1==a2); //Object		
		System.out.println(a1.equals(a2));
		
		String r[] = new String[2];
		char c[] = new char[2];
		r[0] = "sss";
		
		A a3 = null;
		
		String s = "Hello there";
		s = s.substring(0,3);
		
		StringBuffer sb = new StringBuffer();
		sb.append("A");
		sb.append("B");
		System.out.println(sb);
		
		final int i=0; //The value of i can't be changed
		//Variable, function and class can be final
	}
}

class A{
	int i;	
	
	public boolean equals(Object o) {
		System.out.println("Here");
		return false;
	}
}
