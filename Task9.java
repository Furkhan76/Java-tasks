package practise;

//9.Write a Java program to find common elements from four sorted (in non-decreasing order) arrays.

public class Task9 {

	public static void main(String[] args)
	{
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,6,8};
	int c[]= {2,1,10,14};
	int d[]= {12,2,6,1};
	int i,j,k,l;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<b.length;j++)
		{
			for(k=0;k<c.length;k++)
			{
				for(l=0;l<d.length;l++)
				{
					if(a[i]==b[j] && a[i]==c[k] && a[i]==d[l])
					{
						System.out.println(a[i]);
					}
				}
			}
		}
	}

	}

}
