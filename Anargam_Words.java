import java.util.Arrays;

public class Anargam_Words {

	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		if(s.length()!=s1.length())
		{
			System.out.println(" Not Anagram");
			System.exit(0);
		}
		char[]c=s.toCharArray();
		char[]c1=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		for (int i = 0; i < c1.length; i++) 
		{
			if(c[i]!=c1[i])
			{
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("The String is Anagram");
	}

}
