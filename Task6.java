package practise;

//6.Write a Java program to find the Third largest element in an array

public class Task6
{

	public static void main(String[] args) 
	{
		int ar[]= {9,5,7,1,6,2};
		int i,j,u=0;
		for(i=0;i<ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					u=ar[i];
					ar[i]=ar[j];
					ar[j]=u;
				}
			}
		}
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Third largest is "+ar[3]);
	}

}
