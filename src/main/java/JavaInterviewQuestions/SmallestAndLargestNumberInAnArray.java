package JavaInterviewQuestions;

public class SmallestAndLargestNumberInAnArray {

	public static void main(String[] args) {
		 int numbers[] = {-20, 1, 88, 45, 100, 120, 120, -12, 90};
		 
		 int smallest = numbers[0];
		 int largest = numbers[0];		 
		 
		 for(int i=1; i<numbers.length; i++) {
			 if(numbers[i]<smallest) {
				 smallest = numbers[i];
			 }else if(numbers[i]>largest) {
				 largest = numbers[i];
			 }
		 }
		 
		 System.out.println("The smallest number in the array is: "+smallest+
				 			"\n"+
				 			"The largest number in the array is: "+largest);
	}

}
