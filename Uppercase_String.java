
public class Uppercase_String {

	public static void main(String[] args) 
	{
		String s="madam";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)(c[i]-32);
		}
		s=new String(c);
		System.out.println(s);
	}

}
