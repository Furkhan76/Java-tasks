package practise;

//1.Write a Java program to sort following numeric array
//[23,12,45,67,90,23,54,67,8,1,14]
public class Task1 {

	public static void main(String[] args) 
	{
	int a[]= {23,12,45,67,90,23,54,67,8,1,14};
	int i,c,j;
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])
		{
			c=a[i];
			a[i]=a[j];
			a[j]=c;
		}
		}
	}
	for(i=0;i<a.length;i++)
	{
System.out.println(a[i]);
	}
	}

}
