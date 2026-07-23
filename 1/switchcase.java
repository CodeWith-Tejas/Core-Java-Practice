package practise;

public class switchcase {
	public static void main(String[] args) {
		   
	       /*
	        * Only limited possible outcomes......
	        *
	        * Switch()
	        *
	        * Sale:
	        * 10
	        * 20
	        * 30
	        * 40
	        * 50
	        *
	        */
	       
	       
		int choice = 2;
		double price = 1000;
		double discount = 0;

		switch (choice) {
		    case 1:
		        discount = price*10/100;
		        break;

		    case 2:
		        discount = price*20/100;
		        break;

		    case 3:
		        discount = price*30/100;
		        break;

		    default:
		        discount = 0;
		}

		System.out.println("Discount="+discount);
		System.out.println("Final Price="+(price-discount));
	}
}
