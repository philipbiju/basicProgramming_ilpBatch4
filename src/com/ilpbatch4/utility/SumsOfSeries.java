package com.ilpbatch4.utility;

public class SumsOfSeries {

	public static void main(String[] args) {
		int input=3;
		sumOfOdds(input);
	}
	public static void sumOfOdds(int input) {
		int sum=0;
		int odd=1;
		for(int i=1;i<=input;i++) {
			if(i%2!=0) {
			
				sum=sum+odd;
				odd=odd+2;
			}
			else {
				
				sum=sum-odd;
				odd=odd+2;
			}
		}
		System.out.println("Sum is :"+ sum);
	}
}
