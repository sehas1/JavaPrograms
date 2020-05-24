package javaPrograms;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayList<Integer> myList=new MyArrayList<>();
		myList.add(12);
		myList.add(100);
		myList.add(200);
		myList.add(500);
		myList.delete(2);
		//myList.add("hello");
		//myList.display();
		
		System.out.println("Second Array List");
		
		MyArrayList<String> myList1=new MyArrayList<>();
		myList1.add("hello");
		myList1.add("Bye");
		myList1.display();

	}

}
