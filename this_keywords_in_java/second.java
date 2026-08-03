package this_keywords_in_java;

public class second {

	public static void main(String[] args) {
		   City c=new City(10);
	   }

	}

	class City
	{
	   
	   public City()
	   {
	   
	    System.out.println("A");
	   }
	   
	   //(5)
	   public City(int i)
	   {
	       
	       this(4,5);
	       
	       System.out.println("B");
	   }
	   
	   
	   //(10,20)
	   public City(int a, int b)
	   {
	       
	       this();
	       System.out.println("C");
	   }
	}
	
