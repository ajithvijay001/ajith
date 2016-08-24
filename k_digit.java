import java.util.*;
import java.lang.*;
class k_digit
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int n=sc.nextInt();
  ArrayList<Interger> al=new ArrayList<Integer>();
  char ch[]=s.toCharArray();
  for(char i:ch)
    al.add(Integer.parseInt(i+"");
  Collections.sort(al);
  for(int j=0;j<n;j++)
     al.remove(al.size()-1);
  System.out.println(al);
 }
}
