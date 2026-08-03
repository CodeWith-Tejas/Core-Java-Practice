package constructors;

public class fourth {

	public static void main(String[] args) {
		Flipkart_order order=new Flipkart_order("9090909090","411038",80989.90,"kothrud");
	       
	       
	       System.out.println(order.mobile);
	       
	       System.out.println(order.price);
	   }

	}

	class Flipkart_order
	{
	   double price;
	   String address;
	   String mobile;
	   String pincode;
	   
	   public Flipkart_order(String mobile,String pincode)
	   {
	       this.mobile=mobile;
	       this.pincode=pincode;
	       System.out.println("*");
	   }
	   
	   public Flipkart_order(String mobile,String pincode,double price)
	   {
	       this.mobile=mobile;
	       this.pincode=pincode;
	       this.price=price;
	       System.out.println("**");
	   }
	   
	   
	   public Flipkart_order(String mobile,String pincode,double price,String address)
	   {
	       this.mobile=mobile;
	       this.pincode=pincode;
	       this.price=price;
	       this.address=address;
	       System.out.println("***");
	   }
	}