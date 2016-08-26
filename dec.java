import java.util.*;
class dec
{
 public static void main(String args[])
 {
   ArrayList <Integer> al=new ArrayList<>();
   for(int i=new Scanner(System.in).nextInt();i>0;i--)
    al.add(new Scanner(System.in).nextInt());
  Collections.sort(al);
  for(int i=al.size()-1;i>=0;i--)
    System.out.println(al.get(i));
 }
}
