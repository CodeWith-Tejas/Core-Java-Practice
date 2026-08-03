package constructors;

public class third {

	public static void main(String[] args) {
		Animal animal=new Animal(100,45);
		System.out.println(animal.age);
		
		System.out.println(animal.age2);
	}
}
class Animal
{
	/*
	 * CONSTRUCTOR INJECTION
	 */
	/*
	 * INSTANCE VARIABLE
	 */
	int age;
	int age2;
	/*
	 *Non-param 
	 * ()
	 */
	public Animal()
	{
		System.out.println("hello");
	}
	/*
	 * Parameterized Constructor....
	 * (int i)
	 */
	public Animal(int age)
	{
		this.age=age;
	}
	/*
	 * Parameterized Constructor.
	 * (int i, int j)
	 */
	public Animal(int i, int j)
	{
		this.age=i;
		this.age2=j;
	}
}
	
