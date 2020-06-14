package javaPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int array[]= {3,51,2,67,43,8};
	
	
	for(int unsortedArray=array.length-1;unsortedArray>0;unsortedArray--)
	{
		int largest=0;
		for(int k=1;k<unsortedArray;k++)
		{
			if(array[k]>array[largest])
			largest=k;
		}
		swap(array,largest,unsortedArray);
		
	}
	
	System.out.println("Sorted Array is ");
	for (int j = 0; j < array.length; j++)
		System.out.println(array[j]);
	
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
