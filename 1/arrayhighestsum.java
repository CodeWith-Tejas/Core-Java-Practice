package practise;

public class arrayhighestsum {

	public static void main(String[] args) {
	int [] arr = {1000879,9909789,87000,9100098};
	int num=214785621;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<num)
		{
			num=arr[i];
		}
	}
	System.out.println(num);
	}

}
