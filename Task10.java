package practise;

//10.Write a Java program to replace duplicate elements from an integer array with '0'

public class Task10 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,1,1,5,1};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
					a[j]=0;
				}
			}
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
