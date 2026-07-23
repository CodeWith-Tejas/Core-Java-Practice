package practise;

public class num {

	public static void main(String[] args) {
		int num = 0;
		 boolean flag = false;
		for (int i=1;i<=500;i++) {
			if (i%2==0)
				num=num+i;
			 
		 }
		 
		System.out.println(num);
		
		
		//boolean flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("non prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
	}




