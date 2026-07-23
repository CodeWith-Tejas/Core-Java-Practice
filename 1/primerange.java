package practise;

public class primerange {

	public static void main(String[] args) {
		int count = 0;
		for (int num=2; num<=1000;num++) {
			boolean flag=true;
			for (int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(num);
				count++;
				}
			}
		System.out.println("total prime number="+count);
		}
	}


