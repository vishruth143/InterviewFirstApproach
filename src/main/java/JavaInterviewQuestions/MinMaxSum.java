package JavaInterviewQuestions;

import java.util.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
    	long minVal = 0, maxVal = 0;
    	for(int i=0; i<5; i++) {
    		long minf = sumOfNumbers(i, arr);
    		long maxf = sumOfNumbers(i, arr);
    		
    		if(i==0) {
    			minVal = minf;
    			maxVal = maxf;
    		}
    		
    		if(minf<minVal) {
    			minVal = minf;
    		}
    		if(maxf>maxVal) {
    			maxVal=maxf;
    		}    		
    	}
    	System.out.println(minVal+" "+maxVal);
    }
    
    static long sumOfNumbers(int a, long[] arr) {
    	long sum=0;
    	for (int i=0; i<5; i++) {
    		if(i!=a) {
    			sum+=arr[i];
    		}
    	}
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];
        System.out.println("Enter the input array: ");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
