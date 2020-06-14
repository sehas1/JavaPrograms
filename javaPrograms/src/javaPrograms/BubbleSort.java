package javaPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 45, 2, 67, 98 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < (a.length - i) - 1; j++) {
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}

		System.out.println("Sorted Array is ");
		for (int j = 0; j < a.length; j++)
			System.out.println(a[j]);

	}

	public static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		if (i == j) {
			return;
		} else {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	}
}