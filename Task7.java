package practise;

//7. Write a Java program to find the Third smallest element in an array
public class Task7 {

	public static void main(String[] args) 
	{
	int a[]= {9,8,73,2,1,3};
	int i,j,u=0;
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				u=a[i];
				a[i]=a[j];
				a[j]=u;
			}
		}
	}
	System.out.println("the third smallest number is "+a[2]);
	}

}
