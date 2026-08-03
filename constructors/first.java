package constructors;

public class first {

	public static void main(String[] args) {
		Student one=new Student();
		 one.setname("Tejas");
		
		System.out.println(one.getName());
	}
}
class Student
{
			String name;
			String email;
			
			public void setname(String nm)
			{
				if(nm.length()>=5) {
					this.name=nm;
					
				}
		}
			public String getName()
			{
				return this.name;
			}
			}


