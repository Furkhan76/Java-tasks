package practise;


//5.Write a Java program to find the common elements between two arrays of integers
//given below 
//
//Array1 = [23,12,45,67,90,23,54,67,8,1,14]
//Array2 = [43,32,45,97,90,23,54,7,8]

public class Task5 {

	public static void main(String[] args) 
	{
	int s[]= {23,12,45,67,90,23,54,67,8,1,14};
	int p[]= {43,32,45,97,90,23,54,7,8};
	int i,j;
	for(i=0;i<s.length;i++)
	{
		for(j=0;j<p.length;j++)
		{
			if(s[i]==p[j])
			{
			System.out.println(s[i]);
			}
		}
	}
	}

}
