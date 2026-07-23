package practise;

public class eleven {
public static void main(String args[]) {
	int counter=0;
	int sum=0;
	for(int i=1;i<=100;i++) {
		if(i==1)
		{
			continue;
		}
		boolean flag=false;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=true;
			}
		}
	
		if(flag)
		{
			System.out.println("not prime");
		}
		else
		{
			counter++;
			System.out.println("prime:"+i);
			sum=sum+i;
			
		}
		}
	System.out.println("counter:"+counter);
	System.out.println(sum);
	}
}
