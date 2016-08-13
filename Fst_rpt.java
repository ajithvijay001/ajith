import java.io.*;
import java.util.*;
import java.lang.*;
class Fst_rpt
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int index=0;
  for(int i=0;i<arr.length;i++)
  {
   index=arr.indexOf(arr[i],i+1);
   if(index!=-1)
   {
    System.out.println(arr[index]);
    break;
   }
  }
 }
}
