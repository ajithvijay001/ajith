import java.util.*;

public class Divide_Array
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum1=0,i=0,sum=0;
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
			arr[j]=sc.nextInt();
		int len=n/2;
		for(i=0;i<len;i++)
			sum=sum+arr[i];
		int avg1=sum/i,k=0;
		for(i=len;i<arr.length;i++)
		{
			k++;
			sum1+=arr[i];
		}
		int avg2=sum1/k;
		if(avg1==avg2)
			System.out.println("Possible");
		else
			{
				sum=0;
				sum1=0;k=0;avg1=0;avg2=0;
				for(i=0;i<=len;i++)
					sum+=arr[i];
				avg1=sum/i;
				for(i=len+1;i<=arr.length-1;i++)
				{
					k++;
					sum1+=arr[i];
				}
				avg2=sum1/k;
				if(avg1==avg2)
					System.out.println("Possible");
				else
					System.out.println("Not Possible");
			}
	}

}
