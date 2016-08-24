import java.util.*;
import java.lang.*;
class k_digit
{
 public static void main(String []args)
 {
  String s=new Scanner(System.in).next();
	String str="";
	int n=new Scanner(System.in).nextInt();
	ArrayList al=new ArrayList();
	char ch[]=s.toCharArray();
	for(char i:ch)
		al.add(Integer.parseInt(i+""));
	Collections.sort(al);
	for(int j=0;j<n;j++)
		al.remove(al.size()-1);
	for(int j=0;j<al.size();j++)
	   str+=al.get(j);
	System.out.println(str);
 }
}
