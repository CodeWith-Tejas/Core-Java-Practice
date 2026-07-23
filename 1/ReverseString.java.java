package practise;

public class string_first {

	public static void main(String[] args) {
		 String s = "Anna";
	        String s1 = "";

	        for(int i=s.length()-1;i>=0;i--) {
	            s1=s1+s.charAt(i);
	        }

	        
	        System.out.println("Reversed String:"+s1);
	    }

	}

