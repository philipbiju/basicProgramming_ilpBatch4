package com.ilpbatch4.utility;

public class SumOfDiffSeries {

	public static void main(String[] args) {
		int input=3;
		findSeriesSum(input);
		
	}
	 public static void findSeriesSum(int input) {
	        int sum = 0;
	        int sign = 1;
	        for (int i = 1; i <= input; i++) {
	            int term = (int) Math.pow(2 * i - 1, i);
	            sum =sum+ sign * term;
	            sign *= -1;
	        }
	        System.out.print("Sum of the given input "+input+"is "+sum);;
	    }
 
}
