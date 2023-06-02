
public class Reverse_String {
public static String reverse(String s)
{
	char[]c=s.toCharArray();
	String rev=" ";
	for (int i =c.length-1; i>=0; i--)
	{
		rev=rev+c[i];
	}
	return rev;
	}
	public static void main(String[] args)
	{
		String s="Welcome to Jspider";
		String c[]=s.split(" ");
		String rev=" ";
		for (int i =0; i<c.length; i++) 
		{
			c[i]=reverse(c[i]);
		}
		for (int i = 0; i < c.length; i++)
		{
			rev=rev+c[i];
		}
		System.out.println(rev.trim());
	}

}
