package practise;

public class classes_objects {

	public static void main(String[] args) {
		  Student first=new Student();
	       
	       
	       first.studentName="abc";
	       System.out.println(first.studentName);
	       System.out.println(first.studentId);
	       
	       
	       
	       
	   }

	}


	class Student
	{
	   /*
	    * Variables.
	    *
	    * class Class_name{
	    *
	    * =====>
	    * =====>
	    * =====>
	    * =====>
	    * }
	    *
	    */
	   String studentName; //camel case
	   int studentId;
	   int studentAge;
	   int studentStandard;
	}	
	