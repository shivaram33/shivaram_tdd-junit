package assignment8;

public class Solution 
{
	public String remove(String str)
	{
		int l=str.length();
		String res="";
		if(l<1)
			res=str;
		else if(l==1)
		{
			if(str.charAt(0)=='A')
				res="";
			else
				res=str;
		}
		else
		{
			if (str.charAt(0)=='A' && str.charAt(1)=='A')
			{
				res=str.substring(2);
			}
			else if(str.charAt(0)=='A')
			{
				res=str.substring(1);
			}
			else if(str.charAt(1)=='A')
			{
				res=str.charAt(0)+str.substring(2);
			}
			else
			{
				res=str;
			}
		}
		return res;
		
	}

}
