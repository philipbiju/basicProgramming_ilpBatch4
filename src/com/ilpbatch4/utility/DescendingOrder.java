package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1 = 3;
		int input2 = 4;
		int input3 = 5;
		descendingNumber(input1, input2, input3);
	}

	private static void descendingNumber(int input1, int input2, int input3) {
		if (input1 >= input2 && input1 >= input3) {
            if (input2 >= input3) {
            	System.out.print(input1+" "+ input2+" "+ input3);
            } else {
            	System.out.print(input1+" "+ input3+" "+ input2);
            }
        } else if (input2 >= input1 && input2 >= input3) {
            if (input1 >= input3) {
            	System.out.print(input2+" "+ input1+" "+ input3);
            } else {
            	System.out.print(input2+" "+ input3+" "+ input1);
            }
        } else {
            if (input1 >= input2) {
            	System.out.print(input3+" " +input1+" " +input2);
            } else {
            	System.out.print(input3+" " +input2+" " +input1);
            }
        }
}
}
