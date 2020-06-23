package javaPrograms;

public class CountWords {
	public static void main(String arg[]) {
		String st = "SSSsehas is a student";

		int count[] = new int[256];

		for (char x : st.toCharArray()) {
			int ascii = x;
			count[ascii] = ++count[ascii];
		}

		for (int j = 0; j < count.length; j++) {
			if (count[j] != 0)
				System.out.println("The character " + (char) j + " is repeated " + count[j]);

		}
	}

}
