package practise;


//8. Write a Java program to find all pairs of elements in an array whose sum is equal to 21.
public class Task8 
{

	public static void main(String[] args) 
	{
		int b[]= {6,4,3,7,1,9};
		int i,sum=10;
		for(i=0;i<b.length-1;i++)
		{
			if(b[i]+b[i+1]==sum)
			{
				System.out.print("("+b[i]+","+b[i+1]+")");
			}
		}


	}

}
