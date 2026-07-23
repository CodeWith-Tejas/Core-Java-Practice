package practise;

public class two_dimensonial_array {

	public static void main(String[] args) {
		int counter =0;
		int sum=0;
		int[][]arr = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=counter;
				sum = sum + arr[i][j];
				counter++;
			}
		}
		//print Matrix
		System.out.println("Matrix:");
		for (int i = 0; i < 3; i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("Total Elements od Matrix ="+counter);
		System.out.println("sum = " + sum);
	
	}
	}

