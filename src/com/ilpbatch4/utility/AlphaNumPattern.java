package com.ilpbatch4.utility;

public class AlphaNumPattern {

	public static void main(String[] args) {
		int input = 4;
		alphaNumberPattern(input);
 
	}
 
	private static void alphaNumberPattern(int input) {
		
		for (int i = 0; i < input; i++) {
			char alpha = 'A';
			char alphaSm='a';
			int number = 1;
			
			for (int j = 0; j <input-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j<=i; j++) {
				if(j%2!=0) {
					System.out.print(alpha + " ");
				}
				else
				{
					System.out.print(alphaSm + " ");
				}
				alpha = (char) (alpha + 1);
				alphaSm=(char)(alphaSm+1);
			}
			
			for (int j=0; j<=i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
 
}
