package practise;

public class prime {
public static void main(String args[]) {
	 int num = 22;
	 boolean flag = false;
	 
	 for (int i=2; i<num; i++) {
		 if (num%i==0);
		 {
			 flag=true;
			 break;
		 }
	 }
	 if (flag)
	 {
		System.out.println("Non prime"); 
	 }
		else
		{
			System.out.println("Prime");
		}
	 }
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		