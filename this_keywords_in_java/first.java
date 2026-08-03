package this_keywords_in_java;

public class first {

	public static void main(String[] args) {
	
	
	 /**
     * This Calls=>
     *
     * this.variable;
     * this.method();
     * this();
     */

    
    Student stud=new Student(23,"abcd");
    
    
    System.out.println(stud.name);
    
    
}

}

class Student
{
int id;
String name;

public Student(int id, String name)
{
    //call to same class Object variables
    this.id=id;
    this.name=name;
    
    //call to same class method
    this.run();
}


public void run()
{
    System.out.println("method has ran.....");
}
}
