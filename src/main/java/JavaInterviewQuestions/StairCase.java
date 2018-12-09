package JavaInterviewQuestions;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		System.out.println("Enter the input digit: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
