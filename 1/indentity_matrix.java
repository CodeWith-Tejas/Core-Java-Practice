package practise;

public class indentity_matrix {
public static void main(String args[]) {
	int[][]arr=new int[2][2];
	arr[0][0]=1;
	arr[0][1]=0;
	
	arr[1][0]=0;
	arr[1][1]=1;
	boolean oneCheck=true;
	boolean zeroCheck=true;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			if(i==j)
			{
				if(arr[i][j]!=1)
				{
					oneCheck=false;
				}
			}
			else
			{
				if(arr[i][j]!=0)
				{
					zeroCheck=false;
				}
			}
				}
			}
		if(oneCheck && zeroCheck)
		{
			System.out.println("identity Matrix ");
		}
		else
		{
			System.out.println("simple matrix");
		}
}
}
