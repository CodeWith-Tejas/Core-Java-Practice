package practise;

public class seventeen {
public static void main(String args[]) {
	
	/*
	 * give me the first 251 prime numbers.
	 */
	
	int counter=0;
	int number=2;
	
	while(counter<251) {
	boolean flag=true;
	for(int i=2;i<number;i++)
	{
		if(number%i==0)
		{
			flag=false;
		}
		}
	if(flag)
		{
			counter++;
			System.out.println("prime number:"+number);
		}
	number++;
	
}
	System.out.println("counter:"+counter);
}
}
