package javaPrograms;

public class MyArrayList < E > {
Object bucket[];
 private int size;
	MyArrayList()
	{
		size=0;
		bucket=new Object[10];
		
	}
	
	
public	void get(int index)
	{
	    Object value=bucket[index];
	    System.out.println("The value is "+value);
	
	}



public void add(E addValue)
{
 
	if(size>bucket.length-1)
		increaseSize(bucket);
	bucket[size++]=addValue;
}

private void increaseSize(Object[] bucket2) {
	// TODO Auto-generated method stub
	

}


public void delete(int index)
{
 for(int i=index;i<bucket.length-1;i++)
 {
	 bucket[i]=bucket[i+1];
 }
 System.out.println("After deletion");
 this.display();

}

public void display()
{
	for(int j=0;j<size;j++)
		System.out.println(bucket[j]+"\n");
}
}
