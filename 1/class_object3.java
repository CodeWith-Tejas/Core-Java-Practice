package practise;

public class class_object3 {

	public static void main(String[] args) {
		College first = new College();
		 first.name= "MITWPU";
		first.study();
		first.play();
		
	
	}
}

class College 
{
	String name;
	String location;
	
	
	public void study()
	{
		System.out.println("I am studing only in dream not in real world");
	}
	
	public void play()
	{
		System.out.println("I am the best in any play");
	}
	
}