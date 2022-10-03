package practise;
import java.util.*;
//3. Write a Java program to find the index of an array element
public class Task3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	int a[]= {1,3,5,4};
	int i,area=0;
	System.out.println("enter the element whose index is required");
	int in=s.nextInt();
	for(i=0;i<a.length;i++)
	{
		if(a[i]==in)
		{
			 area=i;
		}
		else
		{
			System.out.println("element is not present");
			System.exit(0);
		}
	}
	System.out.println("the index is " +area);

	}

}
