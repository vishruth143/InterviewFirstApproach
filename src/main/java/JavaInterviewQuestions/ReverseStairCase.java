package JavaInterviewQuestions;

import java.util.Scanner;

public class ReverseStairCase {

	public static void main(String[] args) {
		System.out.println("Enter the input number which is greater than 1 and less than 100: ");
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i+j)>n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		in.close();
	}
}
