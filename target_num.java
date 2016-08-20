import java.util.*;

public class rev
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		int arr[]=new int[sc.nextInt()];
		int t=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println(check_trgt(arr,t));
	}

	private static String check_trgt(int[] arr, int t)
	{
		String str=null;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==t)
					str=arr[i]+","+arr[j]+"  ";
			}
		}
		
		return str;
	}

}
