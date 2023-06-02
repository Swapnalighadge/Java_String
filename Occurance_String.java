
public class Occurance_String {

	public static void main(String[] args) 
	{
		String s="Maharastra";
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
			System.out.println(c[i]+" = "+count);
		}
	}
		
	}

}
