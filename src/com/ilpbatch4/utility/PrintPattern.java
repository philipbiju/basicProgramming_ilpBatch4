package com.ilpbatch4.utility;

public class PrintPattern {

	public static void main(String[] args) {
		int input = 3;
		printPatternAnchor(input);
	}
 
	public static void printPatternAnchor(int input) {
 
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print("  ");
			}
			for (int p = i; p >= 1; p--) {
				System.out.print(p + " ");
			}
			for (int p = 2; p <=i ; p++) {
				System.out.print(p + " ");
			}
			System.out.println("");
 
		}
		for(int i=input-1;i>=1;i--) {
			for(int j=input-i;j>=1;j--) {
				System.out.print("  ");
			}
			for (int p = i; p >= 1; p--) {
				System.out.print(p + " ");
			}
			for (int p = 2; p <=i ; p++) {
				System.out.print(p + " ");
			}
			System.out.println("");
		}
	}
 
}
