
public class Remove_Duplicate_Element {

	public static void main(String[] args)
	{
		String s="Maharastra";
		String res=" ";
		char[]c=s.toCharArray();
		boolean[]b=new boolean[c.length];
		for (int i = 0; i < c.length; i++) 
		{
			if(b[i]==false)
			{
			int count=1;
			for (int j =i+1; j < c.length; j++) 
			{
				if(c[i]==c[j])
				{
					b[j]=true;
					count++;
				}
			}
			if(count==1)
			{
				res=res+c[i];
			}
		}
	}
		System.out.println(res);
	}

}
