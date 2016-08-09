import java.io.*;
import java.util.*;
import java.lang.*;
class fact
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println(fact);
}
}
