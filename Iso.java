import java.io.*;
import java.util/*;
import java.lang.*;
class Iso
{
 public static void main()
 {
  Scanner sc=new Scanner(System.in);
  String ip1=sc.next();
  String ip2=sc.next();
  System.out.println(isIso(ip1,ip2);
 }
 public static boolean isIso(String s,String t)
 {
  int tru=0,count=0;
  if(s.length()==t.length()
  {
   for(int i=0;i<s.length()-1;i++)
   {
    if(s.charAT(i)==s.charAt(i+1))
    {
     if(t.charAt(i)==t.charAt(i+1))
      tru=1;
     else
     {
      tru=0;
      break;
     }
    }
    else
     ++count
   }
   if(tru==1 || count==s.length()-1)
    return true;
   else
    return false;
  }
  else
   return false;
 }
}
