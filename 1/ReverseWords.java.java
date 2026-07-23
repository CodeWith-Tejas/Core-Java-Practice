package practise;

public class string_class {

	public static void main(String[] args) {
	
		/*
		 * 
		 */
		

// String one="abc";
//
// String two="aBc";
//
//
// System.out.primeln(one.equalslgnoreCase(two));
		
	String s="i am in pune";//i ma ni enup//[i,am,in,pune]
	String[]arr=s.split("");
	
	String s3="";
	for(int i=0;i<arr.length;i++)
	{
	String s2="";
	for(int j=arr[i].length()-1;j>=0;j--)
	{
		s2=s2+arr[i].charAt(j);
	}
	
	s3=s3+""+s2;
	}
	
	
	System.out.println(s);
	System.out.println(s3.stripLeading());
	}
	}
	