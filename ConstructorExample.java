class Student
{
	String sname ;
	String gender ;
	String department ;
	String contact ;

	Student(String sname , String gender, String department ,String contact)
	{
		this.sname = sname ;
		this.gender = gender ;
		this.department = department ;
		this.contact = contact ;
	}

	public void displayStudent()
	{
		System.out.println("Name : "+sname);
		System.out.println("gender :"+gender);
		System.out.println("department :"+department);
		System.out.println("Contact :"+contact);
	}
}

class Department extends Student {
	String name ;
	String code ;

	Department(String sname , String gender, String department ,String contact,String name , String code)
	{
		super(sname,gender,department,contact);
		this.name = name ;
		this.code = code ;
	}

	public void displayDipartment()
	{
		System.out.println("Name :"+name);
		System.out.println("Code :"+code);
	}
}
class ConstructorExample
{
	public static void main(String[] args) 
	{
		 Department obj = new Department("Prashant","Male","BCA","88063338049","BCA-Department","BCA-2222");
		 obj.displayDipartment();
		 System.out.println("--------------------------------------------------------------");
		Student obj1 = new Student("Prashant","Male","BCA","88063338049");
		obj1.displayStudent();
	}
}