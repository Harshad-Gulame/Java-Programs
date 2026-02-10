import java.util.*;
class Student
{
	static int uniqueId = 34254;
	String sid ;
	String name;
	String email;
	String education;
	int yop;

	{
		this.sid = "SID"+uniqueId++;
	}

	Student(String name,String email, String education , int yop)
	{
		this.name = name;
		this.email = email;
		this.education = education;
		this.yop = yop;
	}

	public void displayStudentInfo()
	{
		System.out.printf("%s : %s ,Email:- %s , Education : %s, yop: %d.%n",sid,name,email,education,yop);

	}
}

class ExampleDriver123
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<>();
		System.out.println(list);

		list.add(new Student("Ramesh","Ramesh@gmail.com","BE-CS",2025));

		list.add(new Student("Suresh","Suresh@gmail.com","BE-IT",2024));

		for (Student els : list )
		 {
			els.displayStudentInfo();
		}
	}
}