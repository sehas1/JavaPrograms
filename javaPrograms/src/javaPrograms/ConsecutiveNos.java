package javaPrograms;

import java.util.Arrays;

public class ConsecutiveNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 100, 4, 200, 1, 3, 2, 56, 5, 76, 34, 24, 25, 26, 28, 29, 7, 9, 6, 8, 11, 10 };

		Arrays.sort(nums);

		int len = 0;
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int first = nums[i];
			int second = nums[i + 1];
			if (second - first == 1)

				len++;

			else {
				if (len > max)

					max = len;

				len = 0;
			}

		}

		System.out.println("Length of consecutive elements is " + (max + 1));

	}

}
