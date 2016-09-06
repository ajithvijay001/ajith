import java.util.*;
public class pro_seed
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=n;
		Set ts=new TreeSet();
		for(int i=1;i<n/2;i++)
			if(n%i==0)
				ts.add(i);
		for(Object a:ts)
		{
			int seed=1;
			int x=(int)a;
			while((int )a>0)
			{
				seed*=(int)a%10;
				a=(int)a/10;
			}
			seed*=x;
			if(seed==temp)
				System.out.println(x);
		}
	}
}
