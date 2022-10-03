package practise;
import java.util.*;

//2.Write a Java program to test if an array contains a 65 value using above array.
//[23,12,45,67,90,23,54,67,8,1,14]

public class Task2 {

	public static void main(String[] args)
	{
	int a[]= {23,12,45,67,90,23,54,67,8,1,14};
	int i;
	for(i=0;i<a.length;i++)
	{
		if(a[i]==65)
		{
			System.out.println("present");
			System.exit(0);
		}
	
	}
		System.out.println("element not found");

	}

}
