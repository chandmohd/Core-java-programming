package src.com.jspider.oece12.string;

public class Anagram {

	public static void main(String[] args) {
		boolean res=isAnagram("Mother In laW", "Hitler Woman");
		if(res)
			System.out.println("yes anagram");
		else
		System.out.println("not anagram");
	}
	public static boolean isAnagram(String s1,String s2) 
	{
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		char[]c1=str1.toCharArray();
		char[]c2=str2.toCharArray();
		int[]a1=new int[128];
		int[]a2=new int[128];
		for (int i = 0; i < c1.length; i++)
		{
			if(c1[i]!=' ')
			{
			a1[c1[i]]++;
			}
		}
		for (int i = 0; i < c2.length; i++){
			if(c2[i]!=' ')
			{
			a2[c2[i]]++;
			}
		}
		for(int i=0;i<128;i++)
			if(a1[i]!=a2[i])
				return false;
		return true;	
	}

}
