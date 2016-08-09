import java.io.*;
import java.util.*;
import java.lang.*;
class out
{
public static void main(String s[])
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<0)
  {
    System.out.println("enter +ve value");
  }
  if(n%2==0)
  {
    System.out.println("even");
  }
  else
  {
    System.out.println("odd");
  }
}
}
}
