package com.bridgelabz.Algorithms;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int[] arr = { 89, 75, 19, 69, 5, 88, 150 };
		System.out.println("Array to be sorted:");
		obj.print(arr);
		obj.mergesort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array:");
		obj.print(arr);
	}

	private void print(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private void mergesort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;
			mergesort(arr, l, mid);
			mergesort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	private void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
