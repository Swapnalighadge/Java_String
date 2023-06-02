
public class Replace_elements {
	public static String Vowels(String s)
	{
		char[]c=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				c[i]='%';
			}
		}
		s=new String(c);
		return s;
	}
	public static String Cosonents(String s)
	{
		char[]c=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u'||c[i]!='A'||c[i]!='E'||c[i]!='I'||c[i]!='O'||c[i]!='U')
			{
				c[i]='#';
			}
		}
		s=new String(c);
		return s;
	}
	public static String Upper(String s)
	{
		char[]c=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>='a'&& c[i]>='z')
			{
				c[i]=(char)(c[i]-32);
			}
		}
		
		s=new String(c);
		return s;
	}
	public static void main(String[] args) {
		String s="Meet me at the Clock Tower";
		String []s1=s.split(" ");
		for (int i = 0; i < s1.length; i++) 
		{
			int x=i%3;
			switch (x)
			{
			case 0:s1[i]=Vowels(s1[i]);
				break;
			case 1:s1[i]=Cosonents(s1[i]);
				break;
			case 2:s1[i]=Upper(s1[i]);
			}
		}
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.print(s1[i]+" ");
		}
		}
		

}
