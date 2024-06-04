package com.ilpbatch4.utility;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 6};
        findDuplicate(arr);
    }
 
    public static void findDuplicate(int[] arr) {
        System.out.println("Duplicates in the array:");
 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
 
}

