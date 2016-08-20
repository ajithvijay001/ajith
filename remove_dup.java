import java.util.*;

public class remove_dup
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//baba
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
			for(int j=i+1;j<ch.length;j++)
				if(ch[i]==ch[j])
					ch[j]='$';
		 str="";
		for(int i=0;i<ch.length;i++)
			if(Character.isAlphabetic(ch[i]))
				str+=ch[i];
		System.out.println(str);
	}
}
