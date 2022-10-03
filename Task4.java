package practise;

//4. Write a Java program to insert an element (8th position) into an array
public class Task4 
{

	public static void main(String[] args)
	{
	int a[]= {1,4,7,8,6,5,2,0,3};
	int i,e=66,f=8;
	
	if(a.length>=f)
	{
		a[f-1]=e;
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}

}
