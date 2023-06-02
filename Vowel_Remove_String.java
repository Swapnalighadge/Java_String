//Remove Vowels from a String....
public class Vowel_Remove_String {

	public static void main(String[] args) 
	{
		String s="I am a Programmer";
		String remove=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i' &&s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='I') 
			{
				remove=remove+s.charAt(i);
			}
		}
		System.out.println(remove);
	}

}
