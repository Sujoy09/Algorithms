package com.bridgelabz.Algorithms;

public class BubbleSort {
	public static void main(String[] args) {

		BubbleSort sort = new BubbleSort();
		int arr[] = { 89, 75, 19, 69, 5, 88, 150 };
		sort.Bubblesort(arr);
		System.out.println("Array Sorting using BubbleSort :");
		sort.print(arr);
	}
	private void print(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	private void Bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
