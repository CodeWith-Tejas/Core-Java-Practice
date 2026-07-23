package practise;

public class arraylowestsum {

	public static void main(String[] args) {
		
			int[]arr= {-3,-5,-7,-2};
			int num=-2147483648;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>num)
				{
					num=arr[i];
			}
		}
		System.out.println(num);
			}
		
	}

