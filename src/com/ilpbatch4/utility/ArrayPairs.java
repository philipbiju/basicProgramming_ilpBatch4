package com.ilpbatch4.utility;

public class ArrayPairs {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 8, 1 };
        int key = 5;
        pairsArray(arr, key);
    }
 
    public static void pairsArray(int arr[], int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println("Pairs: (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
