import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
  		Scanner sc=new Scanner(System.in);
  int a[]=new int[sc.nextInt()];
  Set st=new TreeSet();
  for(int i=0;i<a.length;i++)
  {
    int n=sc.nextInt();
   if(st.add(n))
   {}
   else
     System.out.println("Repeated"+n);
  }
	}
  	
}
