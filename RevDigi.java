import java.io.*;
import java.lang.*;
import java.util.*;
class RevDigi
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int temp=0,t=0;
  while(n>0)
  {
   temp=n%10;
   t=10*t+temp;
   n=n/10;
  }
  System.out.println(t);
 }
}
