package practise;

public class string_second_star {
	public static void main(String args[]) {
String s="Welcome to pune!";

for (int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
	{
		System.out.print("*");	
	}
	else
	{
		System.out.print(s.charAt(i));
	}
}
	}
}