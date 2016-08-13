import java.io.*;
import java.util.*;
import java.lang.*;
class uni
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int i;
  if(n%2!=0)
  {
   int arr[]=new int[n];
   for(i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(i=0;i<arr.length-1;i=i+2)
    {
    if(arr[i]==arr[i+1])
    {
    }
    else
    {
     break;
    }
    }
  }
 }
}

