package javaPrograms;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList<Integer> myList = new MyArrayList<>();
		myList.add(12);
		myList.add(343);

		myList.add(500);
		try {
			myList.delete(1);
		} catch (Exception ex) {
			System.out.println("Wrong Index Entered");
		}
		// myList.add("hello");
		// myList.display();

	}

}
