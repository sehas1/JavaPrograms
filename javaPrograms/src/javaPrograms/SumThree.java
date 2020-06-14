package javaPrograms;

import java.util.Arrays;

public class SumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 303, 4, 27, 20, 3 };
		Arrays.sort(input);  //sort elements
		int k = 50;
		int l;
		int r;
		for (int i = 0; i < input.length - 2; i++) {
			l = i + 1;

			r = input.length - 1;

			while (l < r) {
				if (input[i] + input[l] + input[r] == k) {
					System.out.println("Triplet found ::Values are "+input[i]+","+input[l]+","+input[r]+" equal to sum "+k);
					break;
				} else if ((input[i] + input[l] + input[r]) < k)
					l++;
				else
					r--;
			}

		}

	}

}
