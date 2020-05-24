package javaPrograms;

public class CountWords {
	public static void main(String arg[])
	{
		String st="SSSsehas";
		
		int count[]=new int[256];
	
		
		for(char x:st.toCharArray())
		{
			int ascii=x;
			count[ascii]=++count[ascii];
		}
		
		for(int y:count)
		{
			if(y!=0)
			System.out.print(y+"\n");
			
			
		}
		
	}

}
