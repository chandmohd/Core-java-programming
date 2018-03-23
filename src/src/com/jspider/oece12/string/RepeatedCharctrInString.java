package src.com.jspider.oece12.string;

public class RepeatedCharctrInString {

	public static void main(String args[]) {
		String s="banana is good";
		char[]c=s.toCharArray();
		int []a=new int[128];
		for (int i = 0; i < c.length; i++)
		{
			a[c[i]]++;
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(a[c[i]]>=1&&c[i]!=' ')
			{
				System.out.print(c[i]+""+a[c[i]]);
			}
				
		}
	}

}
